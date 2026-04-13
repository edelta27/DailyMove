package com.example.dailymove.viewmodel

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.example.dailymove.data.Exercise
import com.example.dailymove.data.ExerciseRepository
import com.example.dailymove.storage.ProgressStorage
import java.time.LocalDate


class ExerciseViewModel(application: Application) : AndroidViewModel(application) {

    private val storage = ProgressStorage(application)

    var completedDays by mutableStateOf(0)
        private set

    var lastCompletedDay by mutableStateOf(0)
        private set


    init {
        completedDays = storage.getCompletedDaysCount()
    }
    fun markDayCompleted() {
        val day = calculateCurrentDay()

        if (!storage.isDayCompleted(day)) {
            storage.saveCompletedDay(day)

            val today = LocalDate.now().toString()
            storage.saveLastCompletedDate(today)

            lastCompletedDay = day
            completedDays = storage.getCompletedDaysCount()
        }
    }

    fun calculateCurrentDay(): Int {
        for (i in 1..30) {
            if (!storage.isDayCompleted(i)) {
                return i
            }
        }
        return 30
    }

    fun getExerciseForDay(day: Int): Exercise {
        return ExerciseRepository.exercises[(day - 1) % ExerciseRepository.exercises.size]
    }

    fun isDayCompleted(day: Int): Boolean {
        return storage.isDayCompleted(day)
    }

    fun resetProgress() {
        storage.clearAll()
        completedDays = 0
    }

    fun shouldShowStartScreen(): Boolean {
        val today = calculateCurrentDay()
        val last = storage.getLastOpenDay()
        return today != last
    }

    fun markAppOpenedToday() {
        val day = calculateCurrentDay()
        storage.saveLastOpenDay(day)
    }

    fun isTodayCompleted(): Boolean {
        val day = calculateCurrentDay()
        return storage.isDayCompleted(day)
    }

    fun isNextDayLocked(): Boolean {
        val lastDate = storage.getLastCompletedDate() ?: return false

        val today = LocalDate.now().toString()

        return lastDate == today
    }

}