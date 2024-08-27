package com.x.screencolors.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.x.screencolors.ui.theme.ScreenColorsTheme


@Composable
fun HomeScreen(

    navigateToBlue: () -> Unit,
    navigateToGreen: () -> Unit,
    navigateToRed: () -> Unit,
    navigateToYellow: () -> Unit,

) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(0.3f),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navigateToRed() }) {
                Text(text = "Red")

            }
            Button(
                onClick = { navigateToGreen() }) {
                Text(text = "Green")
            }

            Button(
                onClick = { navigateToBlue() }) {
                Text(text = "Blue")
            }

            Button(
                onClick = { navigateToYellow() }) {
                Text(text = "Yellow")
            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScreenColorsTheme {
        HomeScreen(
            navigateToBlue = {},
            navigateToGreen = {},
            navigateToRed = {},
            navigateToYellow = {}
        )
    }
}