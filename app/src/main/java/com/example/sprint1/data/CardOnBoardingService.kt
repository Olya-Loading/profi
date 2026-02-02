package com.example.sprint1.data

import com.example.sprint1.R
import com.example.sprint1.data.models.CardOnBoarding

class CardOnBoardingService {
    fun getCardsOnBoarding(): List<CardOnBoarding> {
        return listOf(
            CardOnBoarding(
                R.drawable.illustrations1,
                "Confidence in your words",
                "With conversation-based learning, you'll be talking from lesson one",
                "Next"
            ), CardOnBoarding(
                R.drawable.illustrations_2,
                "Take your time to learn",
                "Develop a habit of learning and make it a part of your daily routine",
                "Next"
            ), CardOnBoarding(
                R.drawable.illustrations_3,
                "Confidence in your words",
                "With conversation-based learning, you'll be talking from lesson one",
                "Next"
            )
        )


    }
}