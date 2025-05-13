package com.luislazaro.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdView(
    navController: NavController
){
  Scaffold(
      topBar = {
          TopAppBar(
              title = { TittleBar(name = "Thrid View") },
              colors = TopAppBarDefaults.mediumTopAppBarColors(
                  containerColor = Color.Magenta
              ),
              navigationIcon = {
                  MainIconButton(icon = Icons.Default.ArrowBack) {
                      navController.popBackStack()
                  }
              }
          )
      }
  ) {
        ContentThirdView(navController)
  }
}

@Composable
fun ContentThirdView(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TittleView(name = "Third View")
        Space()
        MainButton(name = "Detail View", backColor = Color.Magenta, color = Color.White) {
            navController.navigate("DetailFromThird")
        }
    }
}