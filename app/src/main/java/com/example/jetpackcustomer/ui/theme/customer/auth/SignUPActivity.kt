package com.example.jetpackcustomer.ui.theme.customer.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.OtpActvitiy
import com.example.jetpackcustomer.ui.theme.demo.AontherActicty
import com.example.jetpackcustomer.ui.theme.demo.CommomVIew

class SignUPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingPreview()
        }
    }

    private fun toast() {
        Toast.makeText(this, "sdffdfd", Toast.LENGTH_SHORT).show()
    }


    @Composable
    fun SignUPForm() {
        val scrollState = rememberScrollState()

        Box() {
            Row(modifier = Modifier.padding(top = 20.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.sign_up_back),
                    contentDescription = "",
                    modifier = Modifier.padding(top = 10.dp)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(
                        text = "Hello!", fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Please fill in to ressiter")


                }
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 20.dp)
                .clickable { otpActvity() }
                .align(Alignment.BottomStart), contentAlignment = Alignment.BottomStart) {
                CommomVIew().Greeting2(name = "ssssssss")// import point to add
            }
            Column {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp, top = 80.dp, bottom = 100.dp)
                        .verticalScroll(scrollState)
                ) {
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }
                    Column(modifier = Modifier.padding(top = 20.dp)) {
                        Row() {
                            Text(text = "UserName", fontWeight = FontWeight.Bold)
                            Text(
                                text = "*",
                                color = Color.Red,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                        }
                        Box(modifier = Modifier.padding(top = 4.dp)) {

                            Card(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .fillMaxWidth()
                            ) {
                                TextField(value = "sdfgh", onValueChange = {}
                                )
                            }

                        }
                    }


                }

            }

        }
    }

    private fun otpActvity() {
        val intent = Intent(this, OtpActvitiy::class.java)
        startActivity(intent)

    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        SignUPForm()

    }
}