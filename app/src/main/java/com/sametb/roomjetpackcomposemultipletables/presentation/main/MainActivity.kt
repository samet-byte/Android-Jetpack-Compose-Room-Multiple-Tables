package com.sametb.roomjetpackcomposemultipletables.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sametb.roomjetpackcomposemultipletables.presentation.home.HomeScreen
import com.sametb.roomjetpackcomposemultipletables.ui.theme.RoomJetpackComposeMultipleTablesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomJetpackComposeMultipleTablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Hello, Room Jetpack Compose Multiple Tables!")
                    Spacer(modifier = Modifier.height(16.dp))
                    HomeScreen()
                }
            }
        }
    }
}
