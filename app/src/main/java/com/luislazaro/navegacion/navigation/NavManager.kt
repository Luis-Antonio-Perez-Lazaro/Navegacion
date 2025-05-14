package com.luislazaro.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
        composable("Detail/{id}/{opcional}", arguments = listOf(
            navArgument("id") { type = NavType.IntType },
            navArgument("opcional") {
                type = NavType.StringType
                nullable = true
                defaultValue = ""
            }
        )){
            val id = it.arguments?.getInt("id") ?: 0
            val opcional = it.arguments?.getString("opcional") ?: ""
            DetailView(navController, id = id, opcional = opcional)
        }
        composable("Third"){
            ThirdView(navController)
        }
        composable("DetailFromThird") {
            DetailView(navController, fromThird = true, opcional = "")
        }
    }
}