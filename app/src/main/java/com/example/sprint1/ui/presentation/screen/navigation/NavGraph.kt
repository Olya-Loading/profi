package com.example.sprint1.ui.presentation.screen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navOptions
import com.example.sprint1.ui.presentation.screen.onboarding1.OnBoarding1Screen

import com.example.sprint1.ui.presentation.screen.splash.SpalshScreen

sealed class Destinations(val route:String){
    data object SplashScreen: Destinations("splash")
    data object OnBoardingScreen1: Destinations("onboarding1")
}

@Composable
fun NavGraph(controller: NavHostController) {
    NavHost(navController = controller, startDestination = Destinations.SplashScreen.route ){
        composable(Destinations.SplashScreen.route) {
            SpalshScreen(controller)
        }
        composable(Destinations.OnBoardingScreen1.route) {
            OnBoarding1Screen()

        }
    }

}