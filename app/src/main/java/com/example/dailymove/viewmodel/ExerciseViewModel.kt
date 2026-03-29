package com.example.dailymove.viewmodel

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.example.dailymove.data.Exercise
import com.example.dailymove.data.ExerciseRepository
import com.example.dailymove.storage.ProgressStorage


class ExerciseViewModel(application: Application) : AndroidViewModel(application) {

    private val storage = ProgressStorage(application)

    var completedDays by mutableStateOf(0)
        private set

    var isLocked by mutableStateOf(false)
        private set

    var lastCompletedDay by mutableStateOf(0)
        private set

    init {
        completedDays = storage.getCompletedDaysCount()
        val day = getCurrentDay()
        isLocked = storage.isDayCompleted(day)
    }
    fun markDayCompleted() {
        val day = getCurrentDay()
        storage.saveCompletedDay(day)

        lastCompletedDay = day
        isLocked = true
        completedDays = storage.getCompletedDaysCount()
    }

    fun getCurrentDay(): Int {
        for (i in 1..30) {
            if (!storage.isDayCompleted(i)) {
                return i
            }
        }
        return 30
    }

    fun getCurrentExercise(): Exercise {
        val day = getCurrentDay()
        return ExerciseRepository.exercises[(day - 1) % ExerciseRepository.exercises.size]
    }

    fun isDayCompleted(day: Int): Boolean {
        return storage.isDayCompleted(day)
    }

    fun resetProgress() {
        storage.clearAll()
        completedDays = 0
        isLocked = false
    }

    fun shouldShowStartScreen(): Boolean {
        val today = getCurrentDay()
        val last = storage.getLastOpenDay()
        return today != last
    }

    fun markAppOpenedToday() {
        val day = getCurrentDay()
        storage.saveLastOpenDay(day)
    }

}