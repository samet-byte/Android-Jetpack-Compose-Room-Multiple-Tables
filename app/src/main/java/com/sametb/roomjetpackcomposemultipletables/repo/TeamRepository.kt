package com.sametb.roomjetpackcomposemultipletables.repo

import com.sametb.roomjetpackcomposemultipletables.TeamDao
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
import javax.inject.Inject


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables
* Created by SAMET BAYAT 
* on 13.02.2024 at 2:02 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

class TeamRepository
    @Inject constructor(
        private val teamDao: TeamDao
    ): ITeamRepository {

    override suspend fun insertTeam(team: Team) { teamDao.insertTeam(team) }

    override suspend fun insertCoach(coach: Coach) { teamDao.insertCoach(coach) }

    override suspend fun getTeamAndCoachWithTeamName(teamName: String): Flow<List<TeamAndCoach>> { return teamDao.getTeamAndCoachWithTeamName(teamName) }

    override suspend fun insertPlayer(player: Player) { teamDao.insertPlayer(player) }

    override suspend fun getTeamWithPlayers(teamName: String): Flow<List<TeamWithPlayers>> { return teamDao.getTeamWithPlayers(teamName) }

    override suspend fun insertPosition(position: Position) { teamDao.insertPosition(position) }

    override suspend fun insertPlayerPositionCrossRef(playerPositionCrossRef: PlayerPositionCrossRef) { teamDao.insertPlayerPositionCrossRef(playerPositionCrossRef) }

    override suspend fun getPlayersWithPosition(positionName: String): Flow<List<PositionWithPlayers>> { return teamDao.getPlayersWithPosition(positionName) }

    override suspend fun getPositionsOfPlayer(playerName: String): Flow<List<PlayerWithPositions>> { return teamDao.getPositionsOfPlayer(playerName) }
}
