package com.sametb.roomjetpackcomposemultipletables.entities.relations

import androidx.room.Entity
import androidx.room.Index


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.entities.relations
* Created by SAMET BAYAT 
* on 13.02.2024 at 12:07 AM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

// m - n relation
// approach is different from the other relations

@Entity(
    primaryKeys = ["playerName", "positionName"],
    indices = [Index(value = ["positionName"])]
)
data class PlayerPositionCrossRef(
    // only the combination of both is the "primary key"
    val playerName: String,
    val positionName: String
)
