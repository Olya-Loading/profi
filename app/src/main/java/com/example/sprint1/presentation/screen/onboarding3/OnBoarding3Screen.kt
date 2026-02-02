package com.example.sprint1.presentation.screen.onboarding3

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.sprint1.presentation.composables.CustomOnBoarding
import com.example.sprint1.presentation.screen.navigation.Destinations
import com.example.sprint1.presentation.screen.onboarding1.OnBoardingViewModel

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun OnBoarding3Screen(viewModel: OnBoardingViewModel = viewModel(), navController: NavHostController) {
    CustomOnBoarding(
        viewModel.onboarding3!!.image,
        viewModel.onboarding3!!.title,
        viewModel.onboarding3!!.text,
        viewModel.onboarding3!!.text_button,
        pager_state = 2,
        onClick = { navController.navigate(Destinations.OnBoarding1.route) }
    )
}