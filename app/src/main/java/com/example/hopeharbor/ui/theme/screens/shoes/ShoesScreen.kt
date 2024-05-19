package com.example.hopeharbor.ui.theme.screens.shoes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hopeharbor.R
import com.example.hopeharbor.ui.theme.navigation.ROUTE_DONATE
import com.example.hopeharbor.ui.theme.navigation.ROUTE_HOME
import com.example.hopeharbor.ui.theme.navigation.ROUTE_RECEIVE

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShoesScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        val mContext = LocalContext.current

        TopAppBar(
            title = {},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUTE_HOME)
                }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Return",
                        tint = Color.Black
                    )
                }
            },

            )

        Column(
            modifier = Modifier
        ) {
            Text(
                text = "SHOES",
                fontSize = 30.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.flipflops),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Flip Flops",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mensshoes),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Mens Shoes",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))


        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.boots),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Boots",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gumboots),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Gum Boots",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.flatshoes),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Flat Shoes",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.heels),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Heels",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.loafers),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Loafers",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sandals),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Sandals",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sneakers),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Sneakers",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
        }

        Column {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sportshoes),
                        contentDescription = "shoes",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )

                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Sport Shoes",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_DONATE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "DONATE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate(ROUTE_RECEIVE) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "RECEIVE",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShoesScreenPreview() {
    ShoesScreen(rememberNavController())
}