package com.luislazaro.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luislazaro.navegacion.views.DetailView
import com.luislazaro.navegacion.views.HomeView
import com.luislazaro.navegacion.views.ThirdView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "Home"){
        composable("Home") {
            HomeView(navController)
        }
        composable("Detail"){
            DetailView(navController)
        }
        composable("Third"){
            ThirdView(navController)
        }
        composable("DetailFromThird") {
            DetailView(navController, fromThird = true)
        }
    }
}