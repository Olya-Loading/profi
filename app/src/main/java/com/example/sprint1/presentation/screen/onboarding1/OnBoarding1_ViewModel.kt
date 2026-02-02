package com.example.sprint1.presentation.screen.onboarding1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.sprint1.data.models.CardOnBoarding
import com.example.sprint1.domain.CardOnBoardingRepository
import kotlin.collections.get

class OnBoardingViewModel: ViewModel() {
    private var _onboarding1 by mutableStateOf<CardOnBoarding?>(null)
    private var _onboarding2 by mutableStateOf<CardOnBoarding?>(null)
    private var _onboarding3 by mutableStateOf<CardOnBoarding?>(null)

    val repository= CardOnBoardingRepository()

    val onboarding1 get()=_onboarding1
    val onboarding2 get()=_onboarding2
    val onboarding3 get()=_onboarding3

    fun loadInfo(){
        _onboarding1= repository.getOnboarding()[0]
        _onboarding2 = repository.getOnboarding()[1]
        _onboarding3 = repository.getOnboarding()[2]
    }
}