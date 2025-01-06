package com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcustomer.R
import com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme.ui.theme.JetpackCustomerTheme

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
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.background_image_header),
            contentDescription = ""
        )
        Column(modifier = Modifier.padding(top = 200.dp)) {
            Text(
                text = "Forget password",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontStyle = FontStyle.Normal,
            )
            Text(text = "We will on Sent Otp Code to your email")
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