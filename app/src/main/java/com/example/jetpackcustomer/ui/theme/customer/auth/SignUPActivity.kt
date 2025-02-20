package com.example.jetpackcustomer.ui.theme.customer.auth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.OtpActvitiy
import com.example.jetpackcustomer.ui.theme.demo.AontherActicty
import com.example.jetpackcustomer.ui.theme.demo.CommomVIew
import com.example.jetpackcustomer.utils.NavigationHelper

class SignUPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingPreview()
        }
    }
//
//    private fun toast() {
//        Toast.makeText(this, "sdffdfd", Toast.LENGTH_SHORT).show()
//    }
//
//
//    @Composable
//    fun SignUPForm() {
//        val scrollState = rememberScrollState()
//
//        Box() {
//            Row(modifier = Modifier.padding(top = 20.dp)) {
//                Image(
//                    painter = painterResource(id = R.drawable.sign_up_back),
//                    contentDescription = "",
//                    modifier = Modifier.padding(top = 10.dp)
//                )
//                Column(modifier = Modifier.padding(start = 10.dp)) {
//                    Text(
//                        text = "Hello!", fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                    Text(text = "Please fill in to ressiter")
//
//
//                }
//            }
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .padding(bottom = 20.dp)
//                .clickable { otpActvity() }
//                .align(Alignment.BottomStart), contentAlignment = Alignment.BottomStart) {
//                CommomVIew().Greeting2(name = "ssssssss")// import point to add
//            }
//            Column {
//                Column(
//                    modifier = Modifier
//                        .padding(start = 10.dp, end = 10.dp, top = 80.dp, bottom = 100.dp)
//                        .verticalScroll(scrollState)
//                ) {
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//                    Column(modifier = Modifier.padding(top = 20.dp)) {
//                        Row() {
//                            Text(text = "UserName", fontWeight = FontWeight.Bold)
//                            Text(
//                                text = "*",
//                                color = Color.Red,
//                                modifier = Modifier.padding(start = 5.dp)
//                            )
//                        }
//                        Box(modifier = Modifier.padding(top = 4.dp)) {
//
//                            Card(
//                                modifier = Modifier
//                                    .border(
//                                        width = 1.dp,
//                                        color = Color.Gray,
//                                        shape = RoundedCornerShape(12.dp)
//                                    )
//                                    .fillMaxWidth()
//                            ) {
//                                TextField(value = "sdfgh", onValueChange = {}
//                                )
//                            }
//
//                        }
//                    }
//
//
//                }
//
//            }
//
//        }
//    }
//
//    private fun otpActvity() {
//        val intent = Intent(this, OtpActvitiy::class.java)
//        startActivity(intent)
//
//    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        SignUpForm()
    }

    @OptIn(ExperimentalMaterial3Api::class)
    private
    @Composable
    fun SignUpForm() {
        val scrollState = rememberScrollState()
        val context: Activity = LocalContext.current as Activity

        val (userName, setUserName) = remember { (mutableStateOf("")) }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.sign_up_back),
                contentDescription = ""
            )
            Column(modifier = Modifier.padding(start = 40.dp)) {
                Text(
                    text = "Hello!", style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "Please fill in to resister",
                    style = TextStyle(
                        fontSize = 10.sp
                    )
                )
            }

            Column(
                modifier = Modifier
                    .padding(top = 50.dp)
                    .verticalScroll(scrollState)
            ) {

                Column() {
//                    Column() {
//                        Text(
//                            text = "Select Service Type", style = TextStyle(
//                                fontSize = 15.sp,
//                                fontStyle = FontStyle.Italic
//                            )
//                        )
//                        LazyVerticalGrid(
//                            columns = GridCells.Fixed(3),
//                            modifier = Modifier.fillMaxSize()
//                        ) {
//
//                            items(list()) { item ->
//                                Box(
//                                    modifier = Modifier
//                                        .padding(8.dp)
//                                ) {
//                                    Text(text = item, color = Color.Black)
//                                }
//
//                            }
//                        }
//                    }
                }
                Column {
                    Text(text = "Business Name", modifier = Modifier.padding(start = 2.dp))
                    Spacer(modifier = Modifier.padding(top = 15.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp, // Stroke width (equivalent to @dimen/_1sdp)
                                color = Color.Gray, // Grey color with 20% opacity (equivalent to @color/placeholder_grey_20)
                                shape = RoundedCornerShape(6.dp) // Radius of 6dp (equivalent to @dimen/_6sdp)

                            )
                    ) {
                        TextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = userName, onValueChange = setUserName,
                            // label = { Text(text = "Enter the UserName")},
                            placeholder = { Text(text = "Enter the UserName") },
                            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),

                            colors = TextFieldDefaults.textFieldColors(
                                Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove shadow/underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove shadow/underline when not focused
                            )
                        )

                    }
                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Email")
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the email") }

                        )

                    }
                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Confirm Email")
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the email") }

                        )

                    }
                }
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth()
                ) {
                    Column(modifier = Modifier.weight(.5f)) {
                        Text(text = "Country")
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Box(
                            modifier = Modifier
                                .height(50.dp)
                                .padding(end = 20.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.Gray,

                                    shape = RoundedCornerShape(6.dp)
                                )
                        ) {
                            TextField(value = userName, onValueChange = setUserName,
                                placeholder = { Text(text = "enter countr") }
                            )

                        }

                    }
                    Column(modifier = Modifier.weight(.5f)) {
                        Text(text = "City")
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Box(
                            modifier = Modifier
                                .height(50.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.Gray,
                                    shape = RoundedCornerShape(6.dp)
                                )
                        ) {
                            TextField(value = userName, onValueChange = setUserName,
                                placeholder = { Text(text = "enter countr") }
                            )
                        }
                    }

                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "IBAN NUMBER")
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the IBAN Number") }

                        )

                    }
                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "IBAN NUMBER")
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the IBAN Number") }

                        )

                    }
                }

                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Account Holder Name")
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the IBAN Number") }

                        )

                    }
                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Bank Name")
                    Box(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        TextField(
                            value = userName,
                            onValueChange = setUserName,
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text(text = "Enter the IBAN Number") }

                        )

                    }
                }
                Column(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Bank Name")
                    Spacer(modifier = Modifier.padding(top = 20.dp))

                    Row(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(id = R.drawable.checkbox_unfilled),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        Text(text = "No")
                        Spacer(modifier = Modifier.padding(start = 30.dp))
                        Image(
                            painter = painterResource(id = R.drawable.checkbox_unfilled),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.padding(start = 10.dp))

                        Text(text = "yes")

                    }


                }
                Spacer(modifier = Modifier.padding(top = 10.dp))

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.checkbox_unfilled),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(start = 10.dp))
                    Text(text = "I have read and agreed to the ")
                    Spacer(modifier = Modifier.padding(start = 10.dp))
                    Text(
                        text = "SignUp",
                        style = TextStyle(
                            color = Color.Green

                        )
                    )
                }

                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                    Box(modifier = Modifier
                        .padding(30.dp)
                        .height(40.dp)
                        .clickable {
                            if (context is Activity) {
                                // If the context is indeed an Activity, navigate using it
                                NavigationHelper.navigateTo(
                                    OtpActvitiy::class.java,
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
                            ), text = "Login", style = TextStyle(
                                color = Color.White
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(bottom = 30.dp))
            }


        }
    }
}

fun list(): ArrayList<String> {
    var list = ArrayList<String>()
    list.add("first")
    list.add("second")
    list.add("third")
    list.add("third")
    list.add("third")
    list.add("third")
    return list
}