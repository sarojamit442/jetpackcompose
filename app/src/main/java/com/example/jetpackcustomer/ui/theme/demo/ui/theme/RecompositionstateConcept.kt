package com.example.jetpackcustomer.ui.theme.demo.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcustomer.ui.theme.demo.ui.theme.ui.theme.JetpackCustomerTheme

class RecompositionstateConcept : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCustomerTheme {
                var count = rememberSaveable { mutableStateOf(0) }

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Notification(count.value) { count.value++ }
                    Txt(count.value)
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun Notification(value: Int, function: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$value")
        Button(onClick = function) {
            Text(text = "Click set Notification")
        }
    }


}
@Composable
fun Txt(value: Int) {
    Column() {
        Text(text ="$value")

    }}


@Composable
fun GreetingPreview3() {
    JetpackCustomerTheme {

    }


}

