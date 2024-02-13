package com.sametb.roomjetpackcomposemultipletables.util

import com.sametb.roomjetpackcomposemultipletables.entities.Coach
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Position
import com.sametb.roomjetpackcomposemultipletables.entities.Team
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerPositionCrossRef


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.util
* Created by SAMET BAYAT 
* on 13.02.2024 at 2:40 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

val team1 = Team("TeamA")
val team2 = Team("TeamB")
val team3 = Team("TeamC")
val team4 = Team("TeamD")

val teamList = listOf(team1, team2, team3, team4)


val player1 = Player("Player1", 1, "TeamA")
val player2 = Player("Player2", 2, "TeamA")
val player3 = Player("Player3", 3, "TeamB")
val player4 = Player("Player4", 4, "TeamC")
val player5 = Player("Player5", 5, "TeamD")

val playerList = listOf(player1, player2, player3, player4, player5)


val coach1 = Coach("Coach1", "TeamA")
val coach2 = Coach("Coach2", "TeamB")
val coach3 = Coach("Coach3", "TeamC")
val coach4 = Coach("Coach4", "TeamD")

val coachList = listOf(coach1, coach2, coach3, coach4)


val position1 = Position("PG")
val position2 = Position("SG")
val position3 = Position("SF")
val position4 = Position("PF")
val position5 = Position("C")

val positionList = listOf(position1, position2, position3, position4, position5)


val playerPositionCrossRef1 = PlayerPositionCrossRef("Player1", "PG")
val playerPositionCrossRef2 = PlayerPositionCrossRef("Player2", "SG")
val playerPositionCrossRef3 = PlayerPositionCrossRef("Player3", "SF")
val playerPositionCrossRef4 = PlayerPositionCrossRef("Player4", "PF")
val playerPositionCrossRef5 = PlayerPositionCrossRef("Player5", "C")

val playerPositionCrossRefList = listOf(
    playerPositionCrossRef1,
    playerPositionCrossRef2,
    playerPositionCrossRef3,
    playerPositionCrossRef4,
    playerPositionCrossRef5
)