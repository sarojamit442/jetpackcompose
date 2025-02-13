package com.example.jetpackcustomer.ui.theme.customer.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.jetpackcustomer.R

class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPageUI()
        }
    }


    @Composable
    fun LoginUI() {

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.background_image_header),
                contentDescription = ""
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, top = 190.dp), verticalArrangement = Arrangement.Center
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .heightIn(6.dp)
                ) {
                    Text(text = "UserName")
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RectangleShape,
                        border = BorderStroke(.5.dp, Color.Blue)
                    ) {
                        TextField(value = "namem", onValueChange = {})

                    }


                }

                Spacer(Modifier.size(12.dp))
                Column() {
                    Text(text = "Password")
                    TextField(value = "namem", onValueChange = {})

                }
                Spacer(Modifier.size(12.dp))

                Text(text = "Forget Password")
                Spacer(Modifier.size(15.dp))

                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.checkbox_unfilled),
                        contentDescription = ""
                    )
                    Text(text = "Remember me", modifier = Modifier.padding(start = 10.dp))

                }
                Spacer(Modifier.size(15.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Red), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Login")

                }
                Spacer(Modifier.size(15.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "OR")

                }
                Spacer(Modifier.size(15.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Red)
                ) {
                    Text(text = "Login", modifier = Modifier.padding(start = 12.dp))

                }
                Spacer(Modifier.size(15.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row()
                    {
                        Text(
                            text = "Don't have account",
                            modifier = Modifier.padding(start = 12.dp)
                        )
                        Text(
                            text = "Sign Up",
                            modifier = Modifier
                                .padding(start = 12.dp)
                                .clickable { navigateToLogin() },
                            color = Color.Blue
                        )

                    }

                }
                Spacer(Modifier.size(15.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row()
                    {
                        Text(
                            text = "Or Continues a guess",
                            modifier = Modifier.padding(start = 12.dp),
                            color = Color.Blue
                        )

                    }

                }

            }

        }

    }


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun LoginPageUI() {
        LoginUI()


    }

    private fun navigateToLogin() {
        val intent = Intent(this, SignUPActivity::class.java)
        startActivity(intent)

    }

}
