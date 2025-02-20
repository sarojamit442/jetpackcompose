package com.example.jetpackcustomer.ui.theme.customer.auth

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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.OtpActvitiy
import com.example.jetpackcustomer.utils.NavigationHelper

class ForgetPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCustomerTheme {
                GreetingPreview5()

            }
        }
    }
}


@Composable
fun ForgetPawword(context: Activity, userName: String, setUserName: (String) -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background_image_header),
            contentDescription = "", modifier = Modifier
                .fillMaxWidth()
        )
        Column(modifier = Modifier.padding(top = 350.dp, start = 10.dp, end = 10.dp)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Forget the passowrd")
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Text(text = "We will send an Otp to your email ")

            }
            Text(text = "Email")

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(6.dp)
                    )
            ) {
                TextField(value = userName,
                    onValueChange = setUserName,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Enter the Email", style = TextStyle(
                                color = Color.Black
                            )
                        )
                    })
            }

            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                Box(modifier = Modifier
                    .padding(30.dp)
                    .height(40.dp)
                    .clickable {
                        if (context is Activity) {
                            // If the context is indeed an Activity, navigate using it
                            NavigationHelper.navigateTo(
                                RestActivity::class.java,
                                shouldFinish = false,
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview5() {
    JetpackCustomerTheme {
        val context: Activity = LocalContext.current as Activity
        var (userName, setUserName) = remember { mutableStateOf("") }
        ForgetPawword(context, userName, setUserName)
    }
}