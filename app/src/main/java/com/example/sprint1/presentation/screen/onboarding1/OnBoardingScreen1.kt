package com.example.sprint1.presentation.screen.onboarding1

import android.annotation.SuppressLint

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.sprint1.presentation.composables.CustomOnBoarding
import com.example.sprint1.presentation.screen.navigation.Destinations
import com.example.sprint1.presentation.screen.theme.Sprint1Theme

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun OnBoarding1Screen(viewModel: OnBoardingViewModel, navController: NavHostController) {
    CustomOnBoarding(
        viewModel.onboarding1!!.image,
        viewModel.onboarding1!!.title,
        viewModel.onboarding1!!.text,
        viewModel.onboarding1!!.text_button,
        pager_state = 0,
        onClick = { navController.navigate(Destinations.OnBoarding2.route) }
    )
    }


