package com.example.sprint1

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.sprint1.ui.presentation.screen.navigation.Destinations
import com.example.sprint1.ui.presentation.screen.navigation.NavGraph
import com.example.sprint1.ui.presentation.screen.onboarding1.OnBoarding1_ViewModel
import com.example.sprint1.ui.theme.Sprint1Theme


class MainActivity : ComponentActivity() {
    val viewModel by viewModels<OnBoarding1_ViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sprint1Theme {
                val navController = rememberNavController()
                NavGraph(navController)
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