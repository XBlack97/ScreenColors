package com.x.screencolors.ui.yellow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun YellowScreen() {

    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
    )
}