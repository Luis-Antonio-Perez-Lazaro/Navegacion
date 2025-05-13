package com.luislazaro.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.luislazaro.navegacion.components.MainButton
import com.luislazaro.navegacion.components.MainIconButton
import com.luislazaro.navegacion.components.Space
import com.luislazaro.navegacion.components.TittleBar
import com.luislazaro.navegacion.components.TittleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailView(
    navController: NavController,
    fromThird: Boolean = false,
    id:Int = 123
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TittleBar(name = "Detail View") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )

        }
    ) {
        ContentDetailView(navController, fromThird, id)
    }
}


@Composable
fun ContentDetailView(
    navController: NavController,
    fromThird: Boolean,
    id:Int
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TittleView(name = "Detail View")
        Space()
        TittleView(name = "$id")
        Space()
        if (!fromThird) {
            MainButton(name = "Third View", backColor = Color.Blue, color = Color.White) {
                navController.navigate("Third")
            }
        } else {
            MainButton(name = "Home View", backColor = Color.Blue, color = Color.White) {
                navController.navigate("Home")
            }
        }
    }
}