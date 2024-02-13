package com.sametb.roomjetpackcomposemultipletables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.sametb.roomjetpackcomposemultipletables.entities.Coach
import com.sametb.roomjetpackcomposemultipletables.entities.Team


/**
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.model.relations
* Created by SAMET BAYAT 
* on 12.02.2024 at 11:34 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

// 1 - 1 relation
data class TeamAndCoach(
    @Embedded val team: Team,

    @Relation(
        parentColumn = "teamName", // Team table column
        entityColumn = "teamName", // Coach table column
    )
    val coach: Coach
)