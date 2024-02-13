package com.sametb.roomjetpackcomposemultipletables.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.sametb.roomjetpackcomposemultipletables.util.coachList
import com.sametb.roomjetpackcomposemultipletables.util.playerList
import com.sametb.roomjetpackcomposemultipletables.util.playerPositionCrossRefList
import com.sametb.roomjetpackcomposemultipletables.util.positionList
import com.sametb.roomjetpackcomposemultipletables.util.teamList


/*
* Room Jetpack Compose Multiple Tables.com.sametb.roomjetpackcomposemultipletables.presentation.home
* Created by SAMET BAYAT 
* on 13.02.2024 at 2:20 PM
* Copyright (c) 2024 UNITED WORLD. All rights reserved.
*/

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel<HomeViewModel>()
) {



    LaunchedEffect(
        key1 = true,
        block = {

            coachList.forEach { viewModel.insertCoach(it) }
            teamList.forEach { viewModel.insertTeam(it) }
            positionList.forEach { viewModel.insertPosition(it) }
            playerList.forEach { viewModel.insertPlayer(it) }
            playerPositionCrossRefList.forEach { viewModel.insertPlayerPositionCrossRef(it) }

            viewModel.getTeamWithPlayers("TeamA")
        }
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            viewModel.teamWithPlayers.collectAsState().value.forEach {teamWithPlayers ->
                teamWithPlayers.players.forEach { player ->
                    Text(text = player.playerName)
                }

            }
        }
    }







}