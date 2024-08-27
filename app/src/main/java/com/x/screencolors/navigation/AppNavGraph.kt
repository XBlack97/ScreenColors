package com.x.screencolors.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.x.screencolors.ui.blue.BlueScreen
import com.x.screencolors.ui.green.GreenScreen
import com.x.screencolors.ui.home.HomeScreen
import com.x.screencolors.ui.red.RedScreen
import com.x.screencolors.ui.yellow.YellowScreen


object SCnavGrapgh{

    const val ROOT = "root_graph"

    const val HOME = "home_graph"

}


@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = SCnavGrapgh.ROOT,
        startDestination = SCnavGrapgh.HOME
    ) {

        composable(route = SCnavGrapgh.HOME) {
            HomeScreen(
                navigateToBlue = {navController.navigate(SCscreen.BlueS.route) },
                navigateToGreen = { navController.navigate(SCscreen.GreenS.route) },
                navigateToRed = { navController.navigate(SCscreen.RedS.route) },
                navigateToYellow = { navController.navigate(SCscreen.YellowS.route) }
                )
        }

        composable(route = SCscreen.BlueS.route) {
           BlueScreen()
        }

        composable(route = SCscreen.YellowS.route) {
            YellowScreen()
        }

        composable(route = SCscreen.GreenS.route) {
            GreenScreen()
        }

        composable(route = SCscreen.RedS.route) {
            RedScreen()
        }
    }
}