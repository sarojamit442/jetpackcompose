package com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.packInts
import com.example.jetpackcustomer.MainActivity
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.network.EndPoints
import com.example.jetpackcustomer.utils.NavigationHelper

class OtpActvitiy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    val context: Activity = LocalContext.current as Activity

    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.background_image_header),
            contentDescription = ""
        )
        Column {


            Column(
                modifier = Modifier
                    .padding(top = 250.dp)
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Forget password",
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontStyle = FontStyle.Normal,
                )
                Text(text = "We will on Sent Otp Code to your email")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                EndPoints.PinView(pinLength = 4, onPinChanged = { "4" })

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Spacer(modifier = Modifier.padding(top = 20.dp))
                    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                        Box(modifier = Modifier
                            .padding(30.dp)
                            .height(40.dp)
                            .clickable {
                                if (context is Activity) {
                                    // If the context is indeed an Activity, navigate using it
                                    NavigationHelper.navigateTo(
                                        MainActivity::class.java,
                                        shouldFinish = true,
                                        activity = context
                                    )
                                } else {
                                    // Handle the case where the context is not an Activity
                                    Log.e("NavigationError", "Context is not an Activity")
                                }

                            }
                            .clip(
                                RoundedCornerShape(
                                    topStart = 10.dp,
                                    topEnd = 10.dp,
                                    bottomEnd = 10.dp,
                                    bottomStart = 10.dp
                                )
                            )
                            .background(Color.Blue)
                            .border(width = 1.dp, color = Color.Blue, shape = RectangleShape)) {
                            Text(
                                modifier = Modifier.padding(
                                    top = 10.dp,
                                    start = 20.dp,
                                    end = 20.dp,
                                    bottom = 10.dp
                                ), text = "Summit", style = TextStyle(
                                    color = Color.White
                                )
                            )
                        }
                    }
                }
            }


        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackCustomerTheme {
        Greeting()
    }
}