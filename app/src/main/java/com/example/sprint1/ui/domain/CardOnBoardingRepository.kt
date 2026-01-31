package com.example.sprint1.ui.domain

import com.example.sprint1.ui.data.models.CardOnBoarding
import com.example.sprint1.ui.data.models.CardOnBoardingService

class CardOnBoardingRepository {
    private val service = CardOnBoardingService()
    fun getCardOnBoarding1(): CardOnBoarding{
        return service.getCardOnBoarding1()
    }
    fun getCardOnBoarding2(): CardOnBoarding{
        return service.getCardOnBoarding2()
    }
    fun getCardOnBoarding3(): CardOnBoarding{
        return service.getCardOnBoarding3()
    }
}
