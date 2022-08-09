package com.example.composeassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeassignment.ui.theme.ComposeAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bike),
                contentDescription = "Bike image",
                modifier = Modifier.height(280.dp).fillMaxWidth(),
            )
            Box(
                modifier = Modifier.height(280.dp).fillMaxWidth(),
                contentAlignment = Alignment.BottomStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ping),
                    contentDescription = "ping",
                    modifier = Modifier.padding(14.dp),
                )
                Text(
                    text = "Barcelona, Spain",
                    color = Color.White,
                    fontSize = 19.sp,
                    modifier = Modifier.padding(10.dp).padding(start = 24.dp),
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Image(
                    painter = painterResource(id = R.drawable.person),
                    contentDescription = "person",
                    modifier = Modifier.size(75.dp).padding(5.dp).clip(CircleShape),
                )

                Text(
                    text = "Biel Moro",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
                Image(
                    painter = painterResource(id = R.drawable.dw3),
                    contentDescription = "download",
                    modifier = Modifier.size(75.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "heart",
                    modifier = Modifier.size(75.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tag),
                    contentDescription = "tag",
                    modifier = Modifier.size(75.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Divider(
                color = Color.Green,
                modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Column(
                    modifier = Modifier.weight(1f),
                ) {

                    Text(
                        text = "Camera",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "NIKON D3200",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Focal Length",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "18.0mm",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "ISO",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "100",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                }
                Column(
                    modifier = Modifier.weight(1f),
                ) {

                    Text(
                        text = "Aperture",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "f/5.0",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Shutter Speed",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "1/125s",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Dimensions",
                        color = Color.White,
                        fontSize = 19.sp,
                    )
                    Text(
                        text = "3906 x 4882",
                        color = Color.Gray,
                        fontSize = 19.sp,
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Divider(
                color = Color.Green,
                modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Text(
                    text = "Views",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "Downloads",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "Likes",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Text(
                    text = "8.8M",
                    color = Color.Gray,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "99.1K",
                    color = Color.Gray,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "1.8K",
                    color = Color.Gray,
                    fontSize = 19.sp,
                    fontStyle = FontStyle.Normal
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Divider(
                color = Color.Green,
                modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Card(
                    elevation = 4.dp,
                    backgroundColor = Color.Gray,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Text("Barcelona", fontWeight = FontWeight.W700, color = Color.White)
                    }
                }
                Card(
                    elevation = 4.dp,
                    backgroundColor = Color.Gray,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Text("Spain", fontWeight = FontWeight.W700, color = Color.White)
                    }
                }
            }
        }
    }
}
