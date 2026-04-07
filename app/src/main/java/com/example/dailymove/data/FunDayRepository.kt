package com.example.dailymove.data

import java.time.LocalDate

object FunDayRepository {
    val funDays = listOf(
        FunDay(1, 1, "Nowy Rok 🎉"),
        FunDay(2, 14, "Walentynki 💛"),
        FunDay(4, 1, "Prima Aprilis 😄"),
        FunDay(4, 7, "Urodziny Aplikacji 🎉"),
        FunDay(6, 1, "Dzień Dziecka 🎈"),
        FunDay(9, 30, "Dzień Kawy ☕"),
        FunDay(12, 24, "Wigilia 🎄")
    )
    fun getTodayFun(): String {
        val today = LocalDate.now()

        val match = funDays.find {
            it.day == today.dayOfMonth && it.month == today.monthValue
        }

        return match?.text ?: "Zrób dziś coś dla siebie 💛"
    }
}

