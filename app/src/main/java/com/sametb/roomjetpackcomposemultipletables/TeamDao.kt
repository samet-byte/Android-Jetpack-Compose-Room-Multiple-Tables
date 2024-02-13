package com.sametb.roomjetpackcomposemultipletables

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.sametb.roomjetpackcomposemultipletables.entities.Coach
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Position
import com.sametb.roomjetpackcomposemultipletables.entities.Team
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerPositionCrossRef
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerWithPositions
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PositionWithPlayers
import com.sametb.roomjetpackcomposemultipletables.entities.relations.TeamAndCoach
import com.sametb.roomjetpackcomposemultipletables.entities.relations.TeamWithPlayers
import kotlinx.coroutines.flow.Flow


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables
* Created by SAMET BAYAT 
* on 12.02.2024 at 11:49 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

@Dao
interface TeamDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeam(team: Team)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCoach(coach: Coach)

    @Transaction // !!
    @Query("SELECT * FROM team WHERE teamName = :teamName")
//    suspend
    fun getTeamAndCoachWithTeamName(teamName: String): Flow<List<TeamAndCoach>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlayer(player: Player)

    @Transaction
    @Query("SELECT * FROM team WHERE teamName = :teamName")
//    suspend
    fun getTeamWithPlayers(teamName: String): Flow<List<TeamWithPlayers>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPosition(position: Position)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlayerPositionCrossRef(playerPositionCrossRef: PlayerPositionCrossRef)

    @Transaction
    @Query("SELECT * FROM POSITION WHERE positionName = :positionName")
//    suspend
    fun getPlayersWithPosition(positionName: String): Flow<List<PositionWithPlayers>>

    @Transaction
    @Query("SELECT * FROM PLAYER WHERE playerName = :playerName")
//    suspend
    fun getPositionsOfPlayer(playerName: String): Flow<List<PlayerWithPositions>>
}