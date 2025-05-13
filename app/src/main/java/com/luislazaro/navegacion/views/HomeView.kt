package com.luislazaro.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.luislazaro.navegacion.components.ActionButton
import com.luislazaro.navegacion.components.MainButton
import com.luislazaro.navegacion.components.Space
import com.luislazaro.navegacion.components.TittleBar
import com.luislazaro.navegacion.components.TittleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(
    navController: NavController
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar(name = "Home View") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
        floatingActionButton = {
            ActionButton()
//            Space()
//            MainButton(name = "Detail View", backColor = Color.Red, color = Color.White) {
//                println("Soy boton generico")
//            }
        }
    ) {
        ContentHomeView(navController)
    }
}


@Composable
fun ContentHomeView(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TittleView(name = "Home View")
        Space()
        MainButton(name = "Detail View", backColor = Color.Red, color = Color.White) {
            navController.navigate("Detail")
        }
    }
}