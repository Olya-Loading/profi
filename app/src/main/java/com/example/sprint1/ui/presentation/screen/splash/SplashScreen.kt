package com.example.sprint1.ui.presentation.screen.splash
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sprint1.R
import com.example.sprint1.ui.presentation.screen.navigation.Destinations
import com.example.sprint1.ui.theme.DeepPurple
import com.example.sprint1.ui.theme.Sprint1Theme
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SpalshScreen(controller: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000)
        controller.navigate(Destinations.OnBoardingScreen1.route)

    }
    Scaffold(containerColor = DeepPurple) {
        Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(R.drawable.splash), "", modifier = Modifier.size(164.dp))
            Text(text="Language App", fontSize = 36.sp)
        }
    }



}

@Preview
@Composable
private fun PrevSplash() {
    Sprint1Theme {
       // SpalshScreen()
    }
    
}