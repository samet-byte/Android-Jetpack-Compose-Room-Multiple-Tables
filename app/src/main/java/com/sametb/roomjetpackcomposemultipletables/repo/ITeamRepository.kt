package com.sametb.roomjetpackcomposemultipletables.repo

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

interface ITeamRepository {

    suspend fun insertTeam(team: Team)
    suspend fun getPositionsOfPlayer(playerName: String): Flow<List<PlayerWithPositions>>
    suspend fun getPlayersWithPosition(positionName: String): Flow<List<PositionWithPlayers>>
    suspend fun insertPlayerPositionCrossRef(playerPositionCrossRef: PlayerPositionCrossRef)
    suspend fun insertPosition(position: Position)
    suspend fun getTeamWithPlayers(teamName: String): Flow<List<TeamWithPlayers>>
    suspend fun insertPlayer(player: Player)
    suspend fun getTeamAndCoachWithTeamName(teamName: String): Flow<List<TeamAndCoach>>
    suspend fun insertCoach(coach: Coach)
}
