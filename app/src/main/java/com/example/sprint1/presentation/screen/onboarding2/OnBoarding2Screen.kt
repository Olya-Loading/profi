package com.example.sprint1.presentation.screen.onboarding2

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.sprint1.presentation.composables.CustomOnBoarding
import com.example.sprint1.presentation.screen.navigation.Destinations
import com.example.sprint1.presentation.screen.onboarding1.OnBoardingViewModel

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun OnBoarding2Screen(viewModel: OnBoardingViewModel = viewModel(), navController: NavHostController) {
    CustomOnBoarding(
        viewModel.onboarding2!!.image,
        viewModel.onboarding2!!.title,
        viewModel.onboarding2!!.text,
        viewModel.onboarding2!!.text_button,
        pager_state = 1,
        onClick = { navController.navigate(Destinations.OnBoarding3.route) }
    )
}