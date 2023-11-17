package com.example.classdashboarddesigns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.classdashboarddesigns.ui.theme.ClassDashboardDesignsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClassDashboardDesignsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }

            }
        }
    }
}

@Composable
fun MainScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxSize()
        .background(Color.Red)) {
        Text(
            text = "DashBoard Designs",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp, bottom = 20.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
        )
        {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom =  20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly){

                Card(modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Green,
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly)
                        {
                            Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                contentDescription = "My icon",
                                tint = Color.White)
                        }
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center)
                        {
                           Text(text = "Mobile app")
                            Divider()
                            Text(text = "New range app")

                        }

                    }

                }

                Card(modifier = Modifier
                    .width(165.dp)
                    .height(200.dp),
                    elevation = CardDefaults
                        .cardElevation(defaultElevation = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Magenta,
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly)
                        {
                            Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                contentDescription = "My icon",
                                tint = Color.White)
                        }
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center)
                        {
                            Text(text = "Mobile app")
                            Divider()
                            Text(text = "New range app")

                        }

                    }

                }

            }
        }

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom =  20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){

            Card(modifier = Modifier
                .width(165.dp)
                .height(200.dp),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Green,
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly)
                    {
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = "My icon",
                            tint = Color.White)
                    }
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center)
                    {
                        Text(text = "Mobile app")
                        Divider()
                        Text(text = "New range app")

                    }

                }

            }

            Card(modifier = Modifier
                .width(165.dp)
                .height(200.dp),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Magenta,
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly)
                    {
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = "My icon",
                            tint = Color.White)
                    }
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center)
                    {
                        Text(text = "Mobile app")
                        Divider()
                        Text(text = "New range app")

                    }

                }

            }

        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom =  20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){

            Card(modifier = Modifier
                .width(165.dp)
                .height(200.dp),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Green,
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly)
                    {
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = "My icon",
                            tint = Color.White)
                    }
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center)
                    {
                        Text(text = "Mobile app")
                        Divider()
                        Text(text = "New range app")

                    }

                }

            }

            Card(modifier = Modifier
                .width(165.dp)
                .height(200.dp),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Magenta,
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly)
                    {
                        Icon(painter = painterResource(id = R.drawable.baseline_phone_android_24),
                            contentDescription = "My icon",
                            tint = Color.White)
                    }
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center)
                    {
                        Text(text = "Mobile app")
                        Divider()
                        Text(text = "New range app")

                    }

                }

            }

        }
    }



}











@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClassDashboardDesignsTheme {
        MainScreen()
    }
}

