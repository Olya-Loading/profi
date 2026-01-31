package com.example.sprint1.ui.presentation.screen.onboarding1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.sprint1.ui.data.models.CardOnBoarding
import com.example.sprint1.ui.data.CardOnBoardingService
import com.example.sprint1.ui.domain.CardOnBoardingRepository

class OnBoarding1_ViewModel: ViewModel() {
    private var _onboarding1 by mutableStateOf<CardOnBoarding?>(null)
    private val repository= CardOnBoardingRepository()

    val onBoarding get() = _onboarding1

    fun loadInfo(){
        _onboarding1=repository.getCardOnBoarding1()
    }

}