package com.example.dailymove.data

import com.example.dailymove.R

object ExerciseRepository {

    val exercises = listOf(

        Exercise(
            id = 1,
            name = "Przysiad",
            description = "Stań prosto, stopy na szerokość bioder. Zrób powolny przysiad do poziomu kolan i wróć do góry.",
            muscleGroups = listOf("uda", "pośladki"),
            funFact = "Regularne przysiady poprawiają postawę i wzmacniają kolana.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.squat,
            minReps = 5
        ),

        Exercise(
            id = 2,
            name = "Pajac",
            description = "Podskocz, rozkładając nogi i unosząc ręce nad głowę.",
            muscleGroups = listOf("całe ciało"),
            funFact = "To ćwiczenie szybko podnosi tętno.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.jumping_jack,
            minReps = 10
        ),

        Exercise(
            id = 3,
            name = "Plank",
            description = "Oprzyj się na przedramionach i palcach stóp. Utrzymuj ciało w jednej linii. Nie opuszczaj bioder. Wytrzymaj minumum 15 sekund.",
            muscleGroups = listOf("brzuch", "plecy", "core"),
            funFact = "Plank wzmacnia głębokie mięśnie stabilizujące, które chronią kręgosłup.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.plank,
            minReps = 1,
            durationSeconds = 15
        ),

        Exercise(
            id = 4,
            name = "Oddech",
            description = "Stań lub usiądź wygodnie. Weź powolny wdech nosem, a następnie długi wydech ustami. Skup się na spokojnym rytmie.",
            muscleGroups = listOf("przepona"),
            funFact = "Świadomy oddech obniża stres i pomaga się skupić.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.breath,
            minReps = 5
        ),

        Exercise(
            id = 5,
            name = "Krążenie bioder",
            description = "Stań prosto, ręce na biodrach. Wykonuj powolne krążenia biodrami w jedną i drugą stronę.",
            muscleGroups = listOf("biodra", "brzuch"),
            funFact = "To ćwiczenie poprawia mobilność i zmniejsza napięcia w dolnej części pleców.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.hip_circulation,
            minReps = 5,
        ),

        Exercise(
            id = 6,
            name = "Krążenia ramion",
            description = "Stań prosto. Wykonuj małe, a potem większe krążenia ramion do przodu i do tyłu.",
            muscleGroups = listOf("barki", "ramiona"),
            funFact = "Regularne krążenia poprawiają zakres ruchu w barkach.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.arm_circulation,
            minReps = 5
        ),

        Exercise(
            id = 7,
            name = "Bird-dog",
            description = "Uklęknij na czworakach. Wyprostuj jednocześnie przeciwną rękę i nogę. Utrzymaj chwilę i zmień stronę.",
            muscleGroups = listOf("plecy", "brzuch", "pośladki"),
            funFact = "To jedno z najlepszych ćwiczeń na stabilizację kręgosłupa.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.bird_dog,
            minReps = 5
        ),

        Exercise(
            id = 8,
            name = "Drzewo",
            description = "Stań na jednej nodze, drugą nogę oprzyj delikatnie na ugiętym kolanie i podnieś ręce do góry.",
            muscleGroups = listOf("brzuch", "stopy"),
            funFact = "Ćwiczenie poprawia stabilizacje i uspokaja organizm.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.tree,
            minReps = 1,
            durationSeconds = 15
        ),

        Exercise(
            id = 9,
            name = "Rozciąganie tułowia",
            description = "Stań prosto. Pochyl się do boku z jedną ręką w górze, a następnie zmień stronę i rękę.",
            muscleGroups = listOf("brzuch", "plecy"),
            funFact = "To ćwiczenie jest bardzo dobre na rozgrzewkę.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.rozciaganie_tulowia,
            minReps = 5
        ),

        Exercise(
            id = 10,
            name = "Kobra",
            description = "Połóż się na brzuchu, połóż dłonie na ziemi na wysokości ramion i odepchnij się",
            muscleGroups = listOf("kręgosłup", "plecy", "brzuch", "ramiona", "kark"),
            funFact = "Ćwiczenie rozciąga mięśnie brzucha.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.cobra,
            minReps = 5
        ),

        Exercise(
            id = 11,
            name = "Mostek",
            description = "Połóż się na plecach, nogi ugięte. Unieś biodra do góry i powoli opuść.",
            muscleGroups = listOf("pośladki", "plecy"),
            funFact = "Mostek wzmacnia mięśnie stabilizujące miednicę i dolne plecy.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.mostek,
            minReps = 5
        ),

        Exercise(
            id = 12,
            name = "Wojownik 2",
            description = "Stań prosto, stopy razem. Zrób duży krok do przodu, zegnij kolano z przodu, noga z tyłu wyprostowana. Staraj się trzymać równowagę. Teraz podnieś głowę i podnoś jednocześnie tułów i wyprostowane ręce ku górze. Weź głęboki oddech i z wydechem opuść ręce. Zmień nogę.",
            muscleGroups = listOf("kręgosłup", "stopy", "uda"),
            funFact = "To ćwiczenie jest na równowagę oraz wzmacnia uda",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.warrior2,
            minReps = 2
        ),
        Exercise(
            id = 13,
            name = "Bieg w miejscu",
            description = "Załóż wygodne buty, stań prosto, luźno ręce i biodra. Przeskakuj z jednej nogi na drugą z ugiętymi kolanami. ",
            muscleGroups = listOf("stopy", "brzuch", "uda", "łydki", "kręgosłup"),
            funFact = "Bieg w miejscu to najlepsze ćwiczenie na rozgrzewkę, szybko podnosi tętno.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.running_in_place,
            minReps = 1,
            durationSeconds = 15
        ),
        Exercise(
            id = 14,
            name = "Krążenie nadgarstek i kostek",
            description = "Stań prosto, podnieś ręce na wysokość wzroku, spleć luźno palce i poruszaj nadgarstki w różnym kierunku. Krążenie kostek, stań luźno na jednej nodze a drugą trzymaj lekko nad ziemią ale palce mają leżeć na ziemi, zrób krążenie kilka w prawo i kilka w lewo, zmień stronę. ",
            muscleGroups = listOf("stopy", "nadgarstki"),
            funFact = "Rozgrzanie nadgarstek i kostek pozwala uniknąć kontuzji ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.wirst_and_ankle_circulation,
            minReps = 5
        ),
        Exercise(
            id = 15,
            name = "Pies z głową w dół",
            description = "Klęknij na podłodze, następnie wyciągnij jak najdalej ręce na ziemi, jakby chciało się położyć brzuch na kolanach, następnie odbij się z podłogi, czyli podnieś biodra do góry. Nie musisz kłaść całych stóp na ziemi i nie musisz prostować kolan, w tej pozycji chodzi o trzymanie równowagi jednocześnie na stopach i rękach. Rozłóż wygodnie palce i całe dłonie na ziemi, przytrzymaj chwilę w tej pozycji, próbuj lekko się przy tym rozciągać ",
            muscleGroups = listOf("stopy", "tylna taśma", "ramiona"),
            funFact = "Aby dobrze wykonać to ćwiczenie warto rozciągnąć i rozluźnić wcześniej taśmę tylną ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.downward_dog,
            minReps = 2,
            durationSeconds = 5
        ),
        Exercise(
            id = 16,
            name = "Podnoszenie nogi",
            description = "Połóż się wygodnie na boku, wyprostój nogi i tę która jest na górze podnieść powoli do góry i kilka razy powtórz. Zmień stronę",
            muscleGroups = listOf("biodra", "brzuch"),
            funFact = "Ćwiczenie to poprawia mobilność biodra. ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.lifting_the_leg,
            minReps = 5
        ),
        Exercise(
            id = 17,
            name = "Skłon do nogi",
            description = "Usiądź wygodnie na ziemi, jedna noga wyprostowana a druga zgięta w wygodny sposób. Nic na siłę, wyprostuj plecy i ich nie zaokrąglaj ich, przez całe ćwiczenie plecy wyprostowane! Zrób skon do wyprostowanej nogi z zamiarem dotknięcia stóp. Zmień stronę. ",
            muscleGroups = listOf("biodra", "uda", "łydki"),
            funFact = "Jest to głównie rozciąganie łydki, jednak jest wskaźnikiem mobilności bioder ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.leg_bend,
            minReps = 4,
            durationSeconds = 10
        ),
        Exercise(
            id = 18,
            name = "Trójkąt",
            description = "Stań prosto, zrób krok do przodu, stopę która została skieruj do boku i zwróć tułów w tą samą stronę. Podnieś wyprostowane ręce na wysokość ramion i zrób skłon do stopy która zrobiła pierwszy krok. Zmień stronę  ",
            muscleGroups = listOf("uda", "stopy", "kręgosłup"),
            funFact = "Ćwiczenie które jest traktowane jako dodatkowe, które przygotowuje do innych ćwiczeń",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.triangle,
            minReps = 4,
            durationSeconds = 5
        ),
        Exercise(
            id = 19,
            name = "Wojownik 1",
            description = " Stań prosto, stopy razem. Zrób duży krok do przodu, zegnij kolano z przodu, noga z tyłu wyprostowana. Staraj się trzymać równowagę. Podnieś ręce , jedna przed wzrokiem a druga z tyłu.",
            muscleGroups = listOf("biodra", "uda", "łydki", "kręgosłup"),
            funFact = "Równowaga jest kluczem do tego ćwiczenia. ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.warrior1,
            minReps = 4,
            durationSeconds = 5
        ),
        Exercise(
            id = 20,
            name = "Wykrok",
            description = " Stań prosto, stopy razem. Zrób duży krok do przodu, zegnij kolano tak aby nie do tykać podłogi i wróć. Staraj się trzymać równowagę. Zmień stronę. To ćwiczenie można robi też w tył – Spróbuj! ",
            muscleGroups = listOf("biodra", "uda", "łydki", "kręgosłup"),
            funFact = "Równowaga jest kluczem do tego ćwiczenia. ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.lunge,
            minReps = 4
        ),
        Exercise(
            id = 21,
            name = "Rower",
            description = " Spróbuj pojeździć na rowerze na dworze bądź na siłowni lub w domu na stacjonarnym. Jeżeli nie masz to połóż się na plecach, trzymaj ręce wzdłuż pleców, a dłońmi trzymaj równowagę, plecy przylegają do ziemi i w kontrolowany sposób zegnij kolana i podnieś nogi do góry i ruszaj nimi tak jakbyś jeździł na rowerze.  ",
            muscleGroups = listOf("biodra", "uda", "łydki", "kręgosłup"),
            funFact = "Ćwiczenie to nie jest wskazane dla osób które pracują na siedząco. ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.bicycle,
            minReps = 10
        ),
        Exercise(
            id = 22,
            name = "Spacer",
            description = " Idź na spacer, bez podcastu, a nawet bez telefonu. Idź tam gdzie jest zieleń, park lub las.  ",
            muscleGroups = listOf("biodra", "kręgosłup"),
            funFact = "Niedoceniana forma ruchu! ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.walk,
            durationSeconds = 1800
        ),
        Exercise(
            id = 23,
            name = "Taniec",
            description = " Włącz swoją ulubioną piosenkę i potańcz we własnym rytmie.  ",
            muscleGroups = listOf("biodra", "kręgosłup"),
            funFact = "Podczas tańca nasz organizm wydziela hormon szczęścia! ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.dance,
            durationSeconds = 180
        ),
        Exercise(
            id = 24,
            name = "Skłon",
            description = " Stań prosto, rozluźnij nogi i z wydechem zrób skłon do przodu. Pamiętaj plecy prosto! Nic na siłę  ",
            muscleGroups = listOf("biodra", "kręgosłup"),
            funFact = "Jest to najbardziej znane ćwiczenie jednocześnie, najmniej pomocne",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.slope,
            minReps = 3
        ),

        Exercise(
            id = 25,
            name = "Zwis na drążku",
            description = " Skorzystaj z drążka w domu, na siłowni lub na świeżym powietrzu bądź na placu zabaw. Chwyć rękoma drążek i próbuj utrzymać się chwilę. Jeżeli jest ciężko to 1 sekunda jest sukcesem po kilku takich seriach po 1 sekundzie możesz próbować 2 sekundy, po kilku tygodnia może osiągniesz 10 sekund! Wyzwanie? A dla tych którzy utrzymają się te 10 sekund, pamiętaj o równym oddechu i to ćwiczenie ma na celu rozciągnąć kręgosłup, spróbuj rozluźnić mięśnie kręgosłupa, zauważysz to gdy biodra trochę się obniżą. ",
            muscleGroups = listOf("brzuch", "kręgosłup", "ramiona"),
            funFact = "Podczas tego ćwiczenia wzmocnisz uchwyt dłoni i ramiona, jest to ćwiczenie które przygotuje cię do podciągania",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.rod,
            minReps = 3,
            durationSeconds = 1
        ),
        Exercise(
            id = 26,
            name = "Pompki",
            description = "Jeżeli zaczynasz to warto spróbować przy ścianie. Stój prosto ręce połóż na ścianie na wysokości barków i zrób pompkę tzn zegnij ręce w łokciach przy czym staraj się je trzymać blisko tułowia. Gdy to nie stanowi dla Ciebie wyzwania staraj się schodzić niżej, rób pompki przy krześle, stole, łóżku a na końcu na podłodze.",
            muscleGroups = listOf("brzuch", "kręgosłup", "ramiona"),
            funFact = "Jest mnóstwo wersji tego ćwiczenia: Kombinacje matematyczne - Jeśli weźmiesz pod uwagę 5 pozycji dłoni, 3 pozycje nóg i 4 rodzaje tempa (pauzy, eksplozywność), to z prostego wyliczenia wychodzi co najmniej 60 wersji, a to dopiero początek zabawy z anatomią.",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.push_ups,
            minReps = 1
        ),
        Exercise(
            id = 27,
            name = "Pozycja dziecka",
            description = "Klęknij i usiądź na stopach. Rozchyl delikatnie kolana i pochyl się do ziemi z wyprostowanymi rękoma, poleż chwilę w tej pozycji.",
            muscleGroups = listOf("kręgosłup"),
            funFact = "Ćwiczenie która wycisza organizm ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.child_pose,
            minReps = 2,
            durationSeconds = 15
        ),
        Exercise(
            id = 28,
            name = "Brzuszki",
            description = "Połóż się na plecach i zegnij nogi w kolanach. Trzymaj ręce przy ramionach bądź głowie. Podnieś tułów za pomocą mięśni brzucha, nie zginaj pleców, trzymaj podbródek ku górze. Ćwiczenie rób z dużą ostrożnością, nie rób nic na siłę! ",
            muscleGroups = listOf("kręgosłup"),
            funFact = "Klasyczne brzuszki są dobrym ćwiczeniem dla sportowców, ale nie dla każdego. Pomimo nazwy brzuszki to nie jest najlepsze ćwiczenie na wzmacnianie brzucha, warto o tym wiedzieć! ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.crunches,
            minReps = 1
        ),
        Exercise(
            id = 29,
            name = "Odwrócona deska",
            description = "Usiądź na ziemi z wyprostowanymi nogami. Dłonie połóż na ziemi płasko i podnieś biodra do góry, tak aby stopy leżały na podłodze. ",
            muscleGroups = listOf("kręgosłup", "brzuch"),
            funFact = "Przy tym ćwiczeniu rozciąga się mięśnie brzucha",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.reverse_plank,
            minReps = 2,
            durationSeconds = 5
        ),
        Exercise(
            id = 30,
            name = "Boczna deska",
            description = "Klęknij na kolana i oprzyj się na dłoniach. Wyprostuj nogi i przenieś ciężar ciała na jedną rękę i przechyl całe ciało na bok łącznie ze stopami. Stopy mają leżeć na krawędzi. Jeżeli jest za ciężko to zegnij nogę bliżej ziemi i oprzyj kolana o ziemie.",
            muscleGroups = listOf("kręgosłup", "brzuch"),
            funFact = "Jest kilka wersji dla początkujących, warto jest próbować bo ćwiczenie wzmacnia wiele partii ciała jednocześnie. ",
            imageFront = 0,
            imageBack = 0,
            imageRes = R.drawable.side_plank,
            minReps = 2,
            durationSeconds = 5
        )

    )
}