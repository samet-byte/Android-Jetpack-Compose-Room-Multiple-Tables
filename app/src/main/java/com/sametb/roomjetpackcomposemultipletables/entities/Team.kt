package com.sametb.roomjetpackcomposemultipletables.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.model
* Created by SAMET BAYAT 
* on 12.02.2024 at 6:57 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

@Entity
data class Team(
    @PrimaryKey(autoGenerate = false)
    val teamName: String
)
