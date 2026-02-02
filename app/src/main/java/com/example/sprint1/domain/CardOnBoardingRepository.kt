package com.example.sprint1.domain

import com.example.sprint1.data.models.CardOnBoarding
import com.example.sprint1.data.CardOnBoardingService

class CardOnBoardingRepository {
    val service = CardOnBoardingService()
    fun getOnboarding(): List<CardOnBoarding>{
        return service.getCardsOnBoarding()
    }
}
