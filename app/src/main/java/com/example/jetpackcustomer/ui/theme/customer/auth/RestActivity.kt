package com.example.jetpackcustomer.ui.theme.customer.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.network.EndPoints

class RestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCustomerTheme {
                val (userName, setUserName) = remember { (mutableStateOf("")) }
                ResetPassword(userName, setUserName)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    JetpackCustomerTheme {
        val (userName, setUserName) = remember { (mutableStateOf("")) }
        ResetPassword(userName, setUserName)
    }
}

@Composable
fun ResetPassword(userName: String, setUserName: (String) -> Unit) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.background_image_header),
            contentDescription = ""
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 300.dp)
        ) {
            Text(
                text = "Otp",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = TextStyle(
                    fontSize = 20.sp,

                    )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "mins", modifier = Modifier.align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                EndPoints.PinView() {

                }

            }
            Column(modifier = Modifier.padding(6.dp)) {
                Text(text = "Password")
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 6.dp,
                                bottomStart = 10.dp,
                                topEnd = 10.dp,
                                bottomEnd = 20.dp
                            )
                        )
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(6.dp)
                        )
                ) {
                    TextField(value = userName, onValueChange = setUserName)
                }
            }
            Column(modifier = Modifier.padding(6.dp)) {
                Text(text = "Confirm Password")
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 6.dp,
                                bottomStart = 10.dp,
                                topEnd = 10.dp,
                                bottomEnd = 20.dp
                            )
                        )
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(6.dp)
                        )
                ) {
                    TextField(value = userName, onValueChange = setUserName)
                }

            }
            Column (modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp, bottom = 10.dp)){
                Box (modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .height(50.dp)
                    .clip(
                        RoundedCornerShape(
                            10.dp
                        )
                    ), contentAlignment = Alignment.Center){
                    Text(text = "Summit")
                }

            }
        }
    }

}
