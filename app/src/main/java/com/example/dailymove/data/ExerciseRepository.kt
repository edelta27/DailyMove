package com.example.dailymove.data

import com.example.dailymove.R

object ExerciseRepository {

    val exercises = listOf(

        Exercise(
            id = 1,
            name = "Przysiad",
            description = "Stań prosto, stopy na szerokość bioder. Zrób powolny przysiad do poziomu kolan i wróć do góry.",
            minReps = 5,
            muscleGroups = listOf("uda", "pośladki"),
            funFact = "Regularne przysiady poprawiają postawę i wzmacniają kolana.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.squat
        ),

        Exercise(
            id = 2,
            name = "Pajac",
            description = "Podskocz, rozkładając nogi i unosząc ręce nad głowę.",
            minReps = 10,
            muscleGroups = listOf("całe ciało"),
            funFact = "To ćwiczenie szybko podnosi tętno.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.jumping_jack
        ),

        Exercise(
            id = 3,
            name = "Plank",
            description = "Oprzyj się na przedramionach i palcach stóp. Utrzymuj ciało w jednej linii. Nie opuszczaj bioder. Wytrzymaj minumum 15 sekund.",
            minReps = 15,
            muscleGroups = listOf("brzuch", "plecy", "core"),
            funFact = "Plank wzmacnia głębokie mięśnie stabilizujące, które chronią kręgosłup.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.plank
        ),

        Exercise(
            id = 4,
            name = "Oddech",
            description = "Stań lub usiądź wygodnie. Weź powolny wdech nosem, a następnie długi wydech ustami. Skup się na spokojnym rytmie.",
            minReps = 5,
            muscleGroups = listOf("przepona"),
            funFact = "Świadomy oddech obniża stres i pomaga się skupić.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.breath
        ),

        Exercise(
            id = 5,
            name = "Krążenie bioder",
            description = "Stań prosto, ręce na biodrach. Wykonuj powolne krążenia biodrami w jedną i drugą stronę.",
            minReps = 5,
            muscleGroups = listOf("biodra", "brzuch"),
            funFact = "To ćwiczenie poprawia mobilność i zmniejsza napięcia w dolnej części pleców.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.hip_circulation
        ),

        Exercise(
            id = 6,
            name = "Krążenia ramion",
            description = "Stań prosto. Wykonuj małe, a potem większe krążenia ramion do przodu i do tyłu.",
            minReps = 5,
            muscleGroups = listOf("barki", "ramiona"),
            funFact = "Regularne krążenia poprawiają zakres ruchu w barkach.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.arm_circulation
        ),

        Exercise(
            id = 7,
            name = "Bird-dog",
            description = "Uklęknij na czworakach. Wyprostuj jednocześnie przeciwną rękę i nogę. Utrzymaj chwilę i zmień stronę.",
            minReps = 5,
            muscleGroups = listOf("plecy", "brzuch", "pośladki"),
            funFact = "To jedno z najlepszych ćwiczeń na stabilizację kręgosłupa.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.bird_dog
        ),

        Exercise(
            id = 8,
            name = "Drzewo",
            description = "Stań na jednej nodze, drugą nogę oprzyj delikatnie na ugiętym kolanie i podnieś ręce do góry.",
            minReps = 15,
            muscleGroups = listOf("brzuch", "stopy"),
            funFact = "Ćwiczenie poprawia stabilizacje i uspokaja organizm.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.tree
        ),

        Exercise(
            id = 9,
            name = "Rozciąganie tułowia",
            description = "Stań prosto. Pochyl się do boku z jedną ręką w górze, a następnie zmień stronę i rękę.",
            minReps = 5,
            muscleGroups = listOf("brzuch", "plecy"),
            funFact = "To ćwiczenie jest bardzo dobre na rozgrzewkę.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.rozciaganie_tulowia
        ),

        Exercise(
            id = 10,
            name = "Kobra",
            description = "Połóż się na brzuchu, połóż dłonie na ziemi na wysokości ramion i odepchnij się",
            minReps = 5,
            muscleGroups = listOf("kręgosłup", "plecy", "brzuch", "ramiona", "kark"),
            funFact = "Ćwiczenie rozciąga mięśnie brzucha.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.cobra
        ),

        Exercise(
            id = 11,
            name = "Mostek",
            description = "Połóż się na plecach, nogi ugięte. Unieś biodra do góry i powoli opuść.",
            minReps = 5,
            muscleGroups = listOf("pośladki", "plecy"),
            funFact = "Mostek wzmacnia mięśnie stabilizujące miednicę i dolne plecy.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.mostek
        )

    )
}