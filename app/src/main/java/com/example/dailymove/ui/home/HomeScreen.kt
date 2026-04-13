package com.example.dailymove.ui.home

import android.util.Log
import com.example.dailymove.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dailymove.viewmodel.ExerciseViewModel
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.dailymove.data.FunDayRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val today = LocalDate.now()
    val formattedDate = today.format(
        DateTimeFormatter.ofPattern("dd.MM.yyyy, EEEE", Locale("pl"))
    )
    val viewModel: ExerciseViewModel = viewModel()
    val day = viewModel.calculateCurrentDay()
    val completedDays = viewModel.completedDays
    val scrollState = rememberScrollState()
    val tips = listOf(
        "💧 Wypij dziś 2 szklanki wody więcej",
        "🌿 Wyjdź na 10 minut na świeże powietrze",
        "🍋 Spróbuj wody z cytryną",
        "🚶‍♀️ Krótki spacer też się liczy",
        "☀️ Złap trochę słońca dziś"
    )

    val tip = tips.random()

    val imageRes = listOf(
        R.drawable.bg1,
        R.drawable.bg2,
        R.drawable.bg3,
        R.drawable.bg4,
        R.drawable.bg5
    ).random()

    val todayFun = FunDayRepository.getTodayFun()

    var showStartScreen by remember {
        mutableStateOf(viewModel.shouldShowStartScreen())
    }
    var showExercise by remember { mutableStateOf(false) }

    if (showExercise) {
        ExerciseScreen(onBack = { showExercise = false })
        return
    }

    if (showStartScreen) {
        StartScreen(onStartClick = {
            viewModel.markAppOpenedToday()
            showStartScreen = false })
        return
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
    ) {
        if (day < 1 || day > 30) {
            Text("Błąd dnia: $day")
            return
        }
        Log.d("TEST", "Day: ${viewModel.getCurrentDay()}")
        Log.d("TEST", "IsDone: ${viewModel.isTodayCompleted()}")
        Text(
            text = "DailyMove",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = formattedDate,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(

            text = todayFun,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(text = "Licznik dni zaliczonych: $completedDays / 30")

        if (viewModel.isTodayCompleted()) {
            Text(
                text = "✔ Dzisiejsze ćwiczenie wykonane",
                color = Color(0xFF4CAF50),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { showExercise = true }) {
            Text("ZACZNIJ")
        }

        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(24.dp))

        CalendarView(viewModel)

        if (completedDays == 30) {
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { viewModel.resetProgress() }) {
                Text("Zacznij od nowa 🔁")
            }
        }

        Card {
            Text(
                text = tip,
                modifier = Modifier.padding(16.dp)
            )
        }
    }

}

@Composable
fun CalendarView(viewModel: ExerciseViewModel) {

    val refreshTrigger = viewModel.completedDays
    val currentDay = viewModel.calculateCurrentDay()

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Kalendarz", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(8.dp))

        for (row in 0 until 5) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (col in 1..6) {
                    val day = row * 6 + col

                    if (day <= 30) {
                        val isDone = viewModel.isDayCompleted(day)

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {

                            val backgroundColor = if (isDone) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.surfaceVariant
                            }

                            val textColor = if (isDone) {
                                MaterialTheme.colorScheme.onPrimary
                            } else {
                                MaterialTheme.colorScheme.onSurface
                            }

                            Surface(
                                color = backgroundColor,
                                shape = MaterialTheme.shapes.medium,
                                border = if (day == currentDay)
                                    BorderStroke(2.dp, MaterialTheme.colorScheme.primary)
                                else null
                            ) {
                                Box(
                                    modifier = Modifier.size(36.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = if (isDone) "✔" else "$day",
                                        color = textColor,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                            Text(
                                text = if (isDone) "✔" else "$day"
                            )
                        }
                    }
                }
            }
        }

    }
}
@Composable
fun StartScreen(onStartClick: () -> Unit) {

    val images = listOf(
        R.drawable.bg1,
        R.drawable.bg2,
        R.drawable.bg3,
        R.drawable.bg4,
        R.drawable.bg5
    )

    val imageRes = images.random()

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.6f),
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.6f)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(16.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Box(
                    modifier = Modifier
                        .background(
                            Color.Black.copy(alpha = 0.3f),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(16.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            text = "DailyMove",
                            fontSize = 36.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Małe kroki. Wielkie zmiany.",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black.copy(alpha = 0.3f)
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Jak się dziś czujesz? 😊",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Nie musisz robić dużo.\nWystarczy, że zaczniesz 💛",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }

            Button(
                onClick = onStartClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Text("ZACZYNAMY", fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}
fun getRepsText(reps: Int): String {
    return when {
        reps == 1 -> "powtórzenie"
        reps in 2..4 -> "powtórzenia"
        else -> "powtórzeń"
    }
}
@Composable
fun ExerciseScreen(onBack: () -> Unit) {
    val viewModel: ExerciseViewModel = viewModel()
    val exercise = viewModel.getCurrentExercise()
    val isLocked = viewModel.isTodayCompleted()
    var reps by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()
    val isDone = viewModel.isTodayCompleted()
    var isError by remember { mutableStateOf(false) }
    val minReps = exercise.minReps ?: 0
    val day = viewModel.getCurrentDay()
    val refresh = viewModel.completedDays


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
            .navigationBarsPadding()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = onBack) {
                Text("Zamknij ✕")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {

            Column(modifier = Modifier.padding(16.dp)) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "Dzień $day",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = exercise.imageRes),
                        contentDescription = exercise.name,
                        modifier = Modifier.size(200.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = exercise.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = exercise.description)

                Text(text = "Mięśnie:")
                exercise.muscleGroups.forEach {
                    Text(text = "• $it")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "Ciekawostka:")
                Text(text = exercise.funFact)

                Spacer(modifier = Modifier.height(16.dp))

                if (exercise.durationSeconds != null)
                {Text(text = "Czas: ${exercise.minReps} sekund")}

                Spacer(modifier = Modifier.height(16.dp))

                if (exercise.minReps != null) {
                    Text(text = "Minimum: ${exercise.minReps} ${getRepsText(exercise.minReps)}")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = reps,
            onValueChange = {
                reps = it
                isError = it.any { char -> !char.isDigit() }
            },
            label = { Text("Tu wpisz ile powtórzeń wykonano") },
            isError = isError
        )

        if (isError) {
            Text(
                text = "Wpisz liczbę powtórzeń",
                color = MaterialTheme.colorScheme.error
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { viewModel.markDayCompleted() },
            enabled = !isDone && reps.isNotBlank() && !isError && reps.toIntOrNull() != null && reps.toInt() >= minReps
        ) {
            Text(if (isLocked) "Zrobione ✔" else "ZROBIONE")
        }
        if (isLocked) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "To był Twój dzień ${viewModel.getCurrentDay()} 👏\nŚwietna robota! Wróć jutro po kolejne ćwiczenie 💛"
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}