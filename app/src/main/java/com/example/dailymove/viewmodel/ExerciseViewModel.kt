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
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit


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
        val day = getCurrentDay()

        storage.saveCompletedDay(day)

        lastCompletedDay = day
        completedDays = storage.getCompletedDaysCount()
    }

    fun calculateCurrentDay(): Int {
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

    fun getCurrentDay(): Int {
        val formatter = DateTimeFormatter.ISO_LOCAL_DATE
        val today = LocalDate.now()

        val startDateString = storage.getStartDate()

        if (startDateString == null) {
            storage.saveStartDate(today.format(formatter))
            return 1
        }

        val startDate = LocalDate.parse(startDateString, formatter)

        val daysBetween = ChronoUnit.DAYS.between(startDate, today).toInt()

        return (daysBetween + 1).coerceAtMost(30)
    }

    fun isTodayCompleted(): Boolean {
        val day = getCurrentDay()
        return storage.isDayCompleted(day)
    }

}