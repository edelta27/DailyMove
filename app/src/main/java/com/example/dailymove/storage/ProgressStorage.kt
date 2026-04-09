package com.example.dailymove.storage

import android.content.Context

class ProgressStorage(context: Context) {

    private val prefs = context.getSharedPreferences("progress", Context.MODE_PRIVATE)

    fun saveCompletedDay(day: Int) {
        prefs.edit().putBoolean("day_$day", true).apply()
    }

    fun isDayCompleted(day: Int): Boolean {
        return prefs.getBoolean("day_$day", false)
    }

    fun getCompletedDaysCount(): Int {
        var count = 0
        for (i in 1..30) {
            if (isDayCompleted(i)) count++
        }
        return count
    }

    fun clearAll() {
        prefs.edit().clear().apply()
    }

    fun saveLastOpenDay(day: Int) {
        prefs.edit().putInt("last_open_day", day).apply()
    }

    fun getLastOpenDay(): Int {
        return prefs.getInt("last_open_day", -1)
    }
    fun saveStartDate(date: String) {
        prefs.edit().putString("start_date", date).apply()
    }

    fun getStartDate(): String? {
        return prefs.getString("start_date", null)
    }
}