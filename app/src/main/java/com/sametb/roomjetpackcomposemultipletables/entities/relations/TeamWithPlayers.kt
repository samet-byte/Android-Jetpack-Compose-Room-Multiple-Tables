package com.sametb.roomjetpackcomposemultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Team


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.entities.relations
* Created by SAMET BAYAT 
* on 12.02.2024 at 11:59 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

// 1 - n relation
data class TeamWithPlayers(
    @Embedded val team: Team, // Embed must be used for the parent table

    @Relation(
        // primary keys of the parent and child tables
        parentColumn = "teamName", // Team table column
        entityColumn = "teamName", // Player table column
    )
    val players: List<Player> // List of players
)