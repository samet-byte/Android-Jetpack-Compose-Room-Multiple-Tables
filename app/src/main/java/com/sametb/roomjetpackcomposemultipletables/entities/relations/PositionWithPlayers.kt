package com.sametb.roomjetpackcomposemultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Position


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.entities.relations
* Created by SAMET BAYAT 
* on 13.02.2024 at 12:13 AM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

data class PositionWithPlayers(
    @Embedded val position: Position,
    @Relation(
        parentColumn = "positionName",
        entityColumn = "playerName",
        associateBy = Junction(PlayerPositionCrossRef::class)
    )
    val players: List<Player>
)