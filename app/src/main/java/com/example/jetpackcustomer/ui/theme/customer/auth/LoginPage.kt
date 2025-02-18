@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcustomer.ui.theme.customer.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcustomer.R

class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }

    @Composable
    fun LoginScreen() {
        val (username, setUsername) = remember { mutableStateOf("") }
        val (password, setPassword) = remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text("Welcome Back!", style = MaterialTheme.typography.labelSmall)

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = username,
                onValueChange = setUsername,
                label = { Text("Username") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = setPassword,
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))

//            Button(
//                onClick = { navController.navigate("home") },
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text("Login")
//            }

            Spacer(modifier = Modifier.height(16.dp))

//            Text(
//                text = "Don't have an account? Sign Up",
//                color = Color.Blue,
//                modifier = Modifier
//                    .clickable { navController.navigate("signUp") }
//                    .align(Alignment.CenterHorizontally)
//            )
        }
    }

//    @Composable
//    fun LoginUI() {
//
//        Box(modifier = Modifier.fillMaxSize()) {
//            Image(
//                painter = painterResource(id = R.drawable.background_image_header),
//                contentDescription = ""
//            )
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(start = 20.dp, top = 190.dp), verticalArrangement = Arrangement.Center
//            ) {
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp)
//                        .heightIn(6.dp)
//                ) {
//                    Text(text = "UserName")
//                    Card(
//                        modifier = Modifier.fillMaxWidth(),
//                        shape = RectangleShape,
//                        border = BorderStroke(.5.dp, Color.Blue)
//                    ) {
//                        TextField(value = "namem", onValueChange = {})
//
//                    }
//
//
//                }
//
//                Spacer(Modifier.size(12.dp))
//                Column() {
//                    Text(text = "Password")
//                    TextField(value = "namem", onValueChange = {})
//
//                }
//                Spacer(Modifier.size(12.dp))
//
//                Text(text = "Forget Password")
//                Spacer(Modifier.size(15.dp))
//
//                Row() {
//                    Image(
//                        painter = painterResource(id = R.drawable.checkbox_unfilled),
//                        contentDescription = ""
//                    )
//                    Text(text = "Remember me", modifier = Modifier.padding(start = 10.dp))
//
//                }
//                Spacer(Modifier.size(15.dp))
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.Red), horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Login")
//
//                }
//                Spacer(Modifier.size(15.dp))
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "OR")
//
//                }
//                Spacer(Modifier.size(15.dp))
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.Red)
//                ) {
//                    Text(text = "Login", modifier = Modifier.padding(start = 12.dp))
//
//                }
//                Spacer(Modifier.size(15.dp))
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Row()
//                    {
//                        Text(
//                            text = "Don't have account",
//                            modifier = Modifier.padding(start = 12.dp)
//                        )
//                        Text(
//                            text = "Sign Up",
//                            modifier = Modifier
//                                .padding(start = 12.dp)
//                                .clickable { navigateToLogin() },
//                            color = Color.Blue
//                        )
//
//                    }
//
//                }
//                Spacer(Modifier.size(15.dp))
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Row()
//                    {
//                        Text(
//                            text = "Or Continues a guess",
//                            modifier = Modifier.padding(start = 12.dp),
//                            color = Color.Blue
//                        )
//
//                    }
//
//                }
//
//            }
//
//        }
//
//    }


    //    @Preview(showBackground = true, showSystemUi = true)
//    @Composable
//    fun LoginPageUI() {
//        LoginUI()
//
//
//    }
//
//    private fun navigateToLogin() {
//        val intent = Intent(this, SignUPActivity::class.java)
//        startActivity(intent)
//
//    }
    @Preview(showSystemUi = true)
    @Composable
    fun MyApp() {
        val (username, setUsername) = remember { mutableStateOf("") }
        val (password, setPassword) = remember { mutableStateOf("") }

        Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Geeks fo Geeks") },
//                modifier = Modifier.background(MaterialTheme.colorScheme.primary) // Modifier applied properly
//            )
//        },
//        floatingActionButton = {
//            FloatingActionButton(onClick = { /* Your action */ }) {
//                Icon(Icons.Filled.Add, contentDescription = "Add")
//            }
//        },
            content = { paddingValues ->
                // Main content with padding applied correctly
                Box(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                    //.paint(painterResource(id = R.drawable.))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.background_image_header),
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Column(

                        ) {

                            Text(
                                text = "UserName",
                                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(start = 10.dp, end = 10.dp, top = 3.dp)
                                    .border(
                                        width = 1.dp, // Stroke width (equivalent to @dimen/_1sdp)
                                        color = Color(0xFFFF0000), // Grey color with 20% opacity (equivalent to @color/placeholder_grey_20)
                                        shape = RoundedCornerShape(6.dp) // Radius of 6dp (equivalent to @dimen/_6sdp)

                                    )

                                // Background color equivalent
                            ) {
                                TextField(
                                    value = username, onValueChange = setUsername,
                                   // label = { Text(text = "Enter the UserName")},
                                    placeholder = { Text(text = "Enter the UserName")},
                                    colors = TextFieldDefaults.textFieldColors(
                                        Color.Black,
                                        focusedIndicatorColor = Color.Transparent, // Remove shadow/underline when focused
                                        unfocusedIndicatorColor = Color.Transparent // Remove shadow/underline when not focused
                                    )
                                )
                            }

                        }
                        Column(
                            modifier = Modifier.padding(top = 20.dp)
                        ) {

                            Text(
                                text = "Password",
                                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(start = 10.dp, end = 10.dp, top = 3.dp)
                                    .border(
                                        width = 1.dp, // Stroke width (equivalent to @dimen/_1sdp)
                                        color = Color(0xFFFF0000), // Grey color with 20% opacity (equivalent to @color/placeholder_grey_20)
                                        shape = RoundedCornerShape(6.dp) // Radius of 6dp (equivalent to @dimen/_6sdp)

                                    )

                                // Background color equivalent
                            ) {
                                TextField(
                                    modifier = Modifier.background(Color.White),
                                    value = username, onValueChange = setUsername,
                                    label = { Text(text = "Enter the password")},
                                    colors = TextFieldDefaults.textFieldColors(
                                        Color.Black,
                                        focusedIndicatorColor = Color.Transparent, // Remove shadow/underline when focused
                                        unfocusedIndicatorColor = Color.Transparent // Remove shadow/underline when not focused
                                    )
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.sign_up_back), // Replace with your image resource
                                    contentDescription = "Password Visibility Toggle", // Image description
                                    modifier = Modifier
                                        .align(Alignment.CenterEnd) // Position the image at the end of the Box
                                        .padding(end = 10.dp) // Add some padding to the right
                                        .clickable { /* Handle image click action */ }
                                )
                            }

                        }

                    }
                }

            },
//        bottomBar = {
//            BottomAppBar {
//                Text("Bottom Bar")
//            }
//        }
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
    }


}
