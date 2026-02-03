package com.example.sprint1.presentation.screen.language

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sprint1.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LanguageScreen(navHostController: NavHostController) {
    val selectedIndex = remember { mutableStateOf("") }
    val language = listOf<String>("Russian", "English", "Chinese", "Belarus", "Kazakh")
    Scaffold(containerColor = Color.White, topBar = {
        TopAppBar(title = { Text("Login") }, navigationIcon = {
            Icon(
                painter = painterResource(
                    R.drawable.ic_left
                ), modifier = Modifier.clickable(
                    onClick = { navHostController.popBackStack() }
                ), contentDescription = ""
            )
        })
    }) {
        Column(modifier = Modifier.fillMaxSize()) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(language){item->
                    val currentIndex = language.indexOf(item)
                    Button(
                        onClick = {
                            if (item == "Russian" || item == "English") selectedIndex.value =
                                currentIndex.toString()
                        },
                        modifier = Modifier
                            .padding(bottom = 20.dp)
                            .width(327.dp)
                            .height(57.dp),
                        colors = ButtonDefaults.buttonColors(if (currentIndex == selectedIndex.value) Orange else Orange_2),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = item,
                            modifier = Modifier.fillMaxSize(),

                            color = Color.Black,
                            fontSize = 22.sp,
                            fontFamily = FredokaFamily,
                            fontWeight = FontWeight.Medium
                        )


                }
            }
        }
    }
}