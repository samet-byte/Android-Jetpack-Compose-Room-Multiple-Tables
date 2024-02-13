package com.sametb.roomjetpackcomposemultipletables.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.entities
* Created by SAMET BAYAT 
* on 13.02.2024 at 12:06 AM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

@Entity
data class Position(
    @PrimaryKey(autoGenerate = false)
    val positionName: String,
)
