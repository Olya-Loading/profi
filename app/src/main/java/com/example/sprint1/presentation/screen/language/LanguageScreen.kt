package com.example.sprint1.presentation.screen.language

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sprint1.R
import com.example.sprint1.presentation.screen.navigation.Destinations
import com.example.sprint1.presentation.screen.theme.Purple40
import com.example.sprint1.presentation.screen.theme.Purple80
import com.example.sprint1.presentation.screen.theme.Sprint1Theme
import java.nio.file.WatchEvent


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LanguageScreen(navHostController: NavHostController) {
    val languages = listOf<String>("Russian", "English", "Chinese", "Belarus", "Kazakh")
    val selectedIndex = remember { mutableStateOf("") }
    Image(
        painter = painterResource(R.drawable.illustrations1),
        contentDescription = "",
        modifier = Modifier.fillMaxSize()
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.primary), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth().height(100.dp), verticalAlignment = Alignment.CenterVertically){
            Icon(painter = painterResource(R.drawable.ic_left), contentDescription = "", modifier = Modifier.clickable(onClick = {navHostController.popBackStack()}))
            Text("Select language", modifier = Modifier.padding(start = 50.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    colorScheme.background,
                    RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                ), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "What is your mother language?")
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)
                            .background(colorScheme.background),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        items(languages) { item ->

                            val currentIndex = languages.indexOf(item)
                            Button(
                                onClick = {
                                    if (item == "Russian" || item == "English") selectedIndex.value =
                                        currentIndex.toString()
                                },
                                colors = ButtonDefaults.buttonColors(if (selectedIndex.value == currentIndex.toString()) Purple80 else Purple40),
                                modifier = Modifier
                                    .padding(top = 20.dp)
                                    .width(270.dp)
                                    .height(60.dp)
                            )
                            {
                                Text(item)
                            }
                        }
                    }

                }
        Button(onClick = {navHostController.navigate(Destinations.Profile.route)}) { }

    }

}
