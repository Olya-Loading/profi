package com.example.sprint1.ui.presentation.screen.onboarding1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.activity.viewModels
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sprint1.ui.theme.Sprint1Theme

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun OnBoarding1Screen() {
    val viewModel = OnBoarding1_ViewModel()
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        viewModel.loadInfo()
        Image(
            painter = painterResource(viewModel.onBoarding!!.image),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Text(text = viewModel.onBoarding!!.title)
        Text(text = viewModel.onBoarding!!.text)
        Button({}) {
            Text(text = viewModel.onBoarding!!.text_button)
        }
        //Image(painter = painterResource(viewModel.))// нужно использовать viewModel, но как подключить из MainActivity?
    }
}

@Preview
@Composable
private fun OnBoardingPrev() {
    Sprint1Theme { OnBoarding1Screen() }
}