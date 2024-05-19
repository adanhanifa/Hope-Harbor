package com.example.hopeharbor.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hopeharbor.ui.theme.screens.about.AboutScreen
import com.example.hopeharbor.ui.theme.screens.clothes.ClothesScreen
import com.example.hopeharbor.ui.theme.screens.donate.DonateScreen
import com.example.hopeharbor.ui.theme.screens.food.FoodScreen
import com.example.hopeharbor.ui.theme.screens.home.HomeScreen
import com.example.hopeharbor.ui.theme.screens.login.LoginScreen
import com.example.hopeharbor.ui.theme.screens.receive.ReceiveScreen
import com.example.hopeharbor.ui.theme.screens.register.RegisterScreen
import com.example.hopeharbor.ui.theme.screens.shoes.ShoesScreen
import com.example.hopeharbor.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination: String= ROUTE_REGISTER){
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUTE_CLOTHES){
            ClothesScreen(navController)
        }
        composable(ROUTE_FOOD){
            FoodScreen(navController)
        }
        composable(ROUTE_SHOES){
            ShoesScreen(navController)
        }
        composable(ROUTE_DONATE){
            DonateScreen(navController)
        }
        composable(ROUTE_RECEIVE){
            ReceiveScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }

    }
}