@file:OptIn(ExperimentalMaterial3Api::class)

package com.x.screencolors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.x.screencolors.navigation.RootNavGraph
import com.x.screencolors.ui.theme.ScreenColorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenColorsTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar(title = { Text("Screen colors") }) }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {

                        val navController = rememberNavController()
                        RootNavGraph(navController = navController)

                    }
                }
            }
        }
    }
}