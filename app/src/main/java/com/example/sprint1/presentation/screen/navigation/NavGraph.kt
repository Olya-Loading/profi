package com.example.sprint1.presentation.screen.navigation

import OnBoarding3Screen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sprint1.presentation.screen.language.LanguageScreen
import com.example.sprint1.presentation.screen.onboarding1.OnBoarding1Screen
import com.example.sprint1.presentation.screen.onboarding1.OnBoardingViewModel
import com.example.sprint1.presentation.screen.onboarding2.OnBoarding2Screen


import com.example.sprint1.presentation.screen.splash.SpalshScreen

sealed class Destinations(val route:String){
    data object OnBoarding1: Destinations("onborading1")
    data object OnBoarding2: Destinations("onboarding2")
    data object OnBoarding3: Destinations("onboarding3")
    data object Splash: Destinations("splash")
    data object Language: Destinations("language")
    data object Profile: Destinations("profile")
}

@Composable
fun NavGraph(navController: NavHostController, viewModel: OnBoardingViewModel) {
    viewModel.loadInfo()
    NavHost(navController, startDestination = Destinations.Splash.route, modifier = Modifier){
        composable(Destinations.Splash.route) {
            SpalshScreen(navController)
        }
        composable(Destinations.OnBoarding1.route) {
            OnBoarding1Screen( viewModel,navController)
        }

        composable(Destinations.OnBoarding2.route) {
            OnBoarding2Screen( viewModel  ,navController=navController)
        }
        composable(Destinations.OnBoarding3.route) {
            OnBoarding3Screen( viewModel  ,navController=navController)
        }
        composable(Destinations.Language.route) {
            LanguageScreen(navController)
        }
    }
}

