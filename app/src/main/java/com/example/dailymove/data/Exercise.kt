package com.example.dailymove.data

data class Exercise(
    val id: Int,
    val name: String,
    val description: String,
    val minReps: Int,
    val muscleGroups: List<String>,
    val funFact: String,
    val imageFront: Int,
    val imageBack: Int,
    val imageRes: Int
)