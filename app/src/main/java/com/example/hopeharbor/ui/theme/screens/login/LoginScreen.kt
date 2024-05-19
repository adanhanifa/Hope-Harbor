package com.example.hopeharbor.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hopeharbor.R
import com.example.hopeharbor.ui.theme.navigation.ROUTE_ABOUT
import com.example.hopeharbor.ui.theme.navigation.ROUTE_HOME
import com.example.hopeharbor.ui.theme.navigation.ROUTE_LOGIN
import com.example.hopeharbor.ui.theme.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavController){
    var email by remember{ mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
        val mContext = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.hopehabour),
                contentDescription = "icon",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(100.dp))
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "LOG IN HERE",
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter your email") },
            //modifier = Modifier.fillMaxWidth()
            leadingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = ""
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = pass,
            onValueChange = { pass = it },
            label = { Text("Enter your password") },
            visualTransformation = PasswordVisualTransformation(),
            // modifier = Modifier.fillMaxWidth()
            leadingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = ""
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { navController.navigate(ROUTE_HOME) },
                modifier = Modifier.width(150.dp), // Adjust the width as needed
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text(
                    text = "LOG IN",
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_REGISTER) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    }
                },
            text = "Don't have an account?Click to Register",
            textAlign = TextAlign.Center,
            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
        )

        Spacer(modifier = Modifier.height(20.dp))
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}