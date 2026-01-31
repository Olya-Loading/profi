package com.example.sprint1.ui.data

import com.example.sprint1.R
import com.example.sprint1.ui.data.models.CardOnBoarding

class CardOnBoardingService {
    fun getCardOnBoarding1(): CardOnBoarding {
        return CardOnBoarding(
            image = R.drawable.illustrations1,
            title = "Confidence in your words",
            text = "With conversation-based learning, you'll be talking from lesson one",
            text_button = "Next"
        )
    }
    fun getCardOnBoarding2(): CardOnBoarding {
        return CardOnBoarding(
            image = R.drawable.illustrations_2,
            title = "Take your time to learn",
            text = "Develop a habit of learning and make it a part of your daily routine",
            text_button = "More"
        )
    }
    fun getCardOnBoarding3(): CardOnBoarding {
        return CardOnBoarding(
            image = R.drawable.illustrations_3,
            title = "The lessons you need to learn",
            text = "Using a variety of learning styles to learn and retain",
            text_button = "Choose a language"
        )
    }
}