package com.example.sprint1

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.sprint1.presentation.screen.navigation.NavGraph
import com.example.sprint1.presentation.screen.onboarding1.OnBoardingViewModel
import com.example.sprint1.presentation.screen.theme.Sprint1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sprint1Theme {
                val viewModel: OnBoardingViewModel by viewModels()
                val navController = rememberNavController()
                NavGraph(navController, viewModel)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sprint1Theme {
        Greeting("Android")
    }
}