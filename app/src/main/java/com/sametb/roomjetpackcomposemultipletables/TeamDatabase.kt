package com.sametb.roomjetpackcomposemultipletables

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sametb.roomjetpackcomposemultipletables.entities.Coach
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Position
import com.sametb.roomjetpackcomposemultipletables.entities.Team
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerPositionCrossRef


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables
* Created by SAMET BAYAT 
* on 13.02.2024 at 12:25 AM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/


@Database(
    entities = [
        Coach::class,
        Team::class,
        Player::class,
        Position::class,
        PlayerPositionCrossRef::class,
    ],
    version = 2,
    exportSchema = false
)
abstract class TeamDatabase: RoomDatabase() {

    abstract fun teamDao(): TeamDao

}

/*
https://medium.com/@chn_dr/room-dagger-hilt-jetpack-compose-material-3-d347046e8f61
https://youtu.be/iTdzBM1zErA?feature=shared&t=302
~/Downloads
congregation
*/