package com.example.hopeharbor.ui.theme.screens.about

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hopeharbor.R

@Composable
fun AboutScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
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
                text = "Contact Us via the links below to learn more",
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(
            onClick = {

                val smsIntent= Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0740690694".toUri()
                smsIntent.putExtra("sms_body","Hello customer,how may we be of your help?")
                mContext.startActivity(smsIntent)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {

            Icon(imageVector = Icons.Default.MailOutline,"",tint = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {

                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0740690694".toUri()
                mContext.startActivity(callIntent)

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {

            Icon(imageVector = Icons.Default.Call,"",tint = Color.Black)

        }
        Spacer(modifier = Modifier.height(25.dp))

        OutlinedButton(
            onClick = {

                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("adanhanifa@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Hope Harbor")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Welcome to our donation application")
                mContext.startActivity(shareIntent)



            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {

            Icon(imageVector = Icons.Default.Email,"",tint = Color.Black)

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out our donation application")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {

            Icon(imageVector = Icons.Default.Share,"",tint = Color.Black)

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}