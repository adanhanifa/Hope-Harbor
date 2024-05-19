package com.example.hopeharbor.ui.theme.screens.splash

import android.content.res.Configuration
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import com.example.hopeharbor.R
import com.example.hopeharbor.ui.theme.navigation.ROUTE_REGISTER


@Composable
fun SplashScreen(navController: NavHostController) {

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                }))

        delay(3500L)
        navController.navigate(ROUTE_REGISTER)
    }


    Box(modifier =Modifier.fillMaxSize())
    Image( painter = painterResource(id = R.drawable.hopehabour),
        contentDescription = "logo",
        modifier = Modifier.fillMaxSize(),


    )
    LazyColumn {
        item {

            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ){

                Image( painter = painterResource(id = com.example.hopeharbor.R.drawable.hopehabour),
                    contentDescription = "logo",
                    modifier = Modifier.scale(scale.value)
                )

                Text("Hope Harbor", color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(60.dp
                    )

                )

            }

        }
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    SplashScreen(rememberNavController())
}