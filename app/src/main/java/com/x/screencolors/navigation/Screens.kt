package com.x.screencolors.navigation


sealed class SCscreen(val route: String) {
    object BlueS : SCscreen("blue")
    object RedS : SCscreen("red")
    object GreenS : SCscreen("green")
    object YellowS : SCscreen("yellow")
}