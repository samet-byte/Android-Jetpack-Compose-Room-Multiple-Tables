package com.sametb.roomjetpackcomposemultipletables.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sametb.roomjetpackcomposemultipletables.repo.TeamRepository
import com.sametb.roomjetpackcomposemultipletables.entities.Coach
import com.sametb.roomjetpackcomposemultipletables.entities.Player
import com.sametb.roomjetpackcomposemultipletables.entities.Position
import com.sametb.roomjetpackcomposemultipletables.entities.Team
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerPositionCrossRef
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PlayerWithPositions
import com.sametb.roomjetpackcomposemultipletables.entities.relations.PositionWithPlayers
import com.sametb.roomjetpackcomposemultipletables.entities.relations.TeamAndCoach
import com.sametb.roomjetpackcomposemultipletables.entities.relations.TeamWithPlayers
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject constructor(
    private val repository: TeamRepository,
) : ViewModel() {


    private val _teamAndCoachWithTeamName = MutableStateFlow<List<TeamAndCoach>>(emptyList())
    val teamAndCoachWithTeamName = _teamAndCoachWithTeamName.asStateFlow()

    private val _teamWithPlayers = MutableStateFlow<List<TeamWithPlayers>>(emptyList())
    val teamWithPlayers = _teamWithPlayers.asStateFlow()

    private val _playersWithPosition = MutableStateFlow<List<PositionWithPlayers>>(emptyList())
    val playersWithPosition = _playersWithPosition.asStateFlow()

    private val _positionsOfPlayer = MutableStateFlow<List<PlayerWithPositions>>(emptyList())
    val positionsOfPlayer = _positionsOfPlayer.asStateFlow()


    fun insertTeam(team: Team) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertTeam(team)
        }
    }

    fun insertCoach(coach: Coach) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertCoach(coach)
        }
    }

    fun getTeamAndCoachWithTeamName(teamName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getTeamAndCoachWithTeamName(teamName).collectLatest {
                _teamAndCoachWithTeamName.tryEmit(it)
            }
        }
    }

    fun insertPlayer(player: Player) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPlayer(player)
        }
    }

    fun getTeamWithPlayers(teamName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getTeamWithPlayers(teamName)
            result.collectLatest {
                _teamWithPlayers.tryEmit(it)
            }
        }
    }

    fun insertPosition(position: Position) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPosition(position)
        }
    }

    fun insertPlayerPositionCrossRef(playerPositionCrossRef: PlayerPositionCrossRef) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPlayerPositionCrossRef(playerPositionCrossRef)
        }
    }

    fun getPlayersWithPosition(positionName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getPlayersWithPosition(positionName)
            result.collectLatest {
                _playersWithPosition.tryEmit(it)
            }
        }
    }

    fun getPositionsOfPlayer(playerName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getPositionsOfPlayer(playerName)
            result.collectLatest {
                _positionsOfPlayer.tryEmit(it)
            }
        }
    }

}
