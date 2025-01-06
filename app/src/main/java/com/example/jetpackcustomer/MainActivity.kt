package com.example.jetpackcustomer

import android.app.Application
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.jetpackcustomer.ui.theme.JetpackCustomerTheme
import com.example.jetpackcustomer.ui.theme.customer.auth.LoginPage
import com.example.jetpackcustomer.ui.theme.demo.AontherActicty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowANDFEatures()
        }
    }


  @Composable
  fun Main(){
      Row() {
          Column(verticalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)) {

              Button(
                  onClick = { navigateToSecondActivity() },
                  modifier = Modifier.padding(top = 16.dp)

                  
              ) {
                  Text("Demo Project")
              }
              Button(
                  onClick = { navigateToLogin() },
                  modifier = Modifier.padding(top = 16.dp)
              ) {
                  Text("Project")
              }
              Text(text = "dsfg", modifier = Modifier.clickable { navigateToLogin() })
          }
      }

  }
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun RowANDFEatures() {
      Main()
    }

    private fun navigateToSecondActivity() {
        val intent = Intent(this, AontherActicty::class.java)
        startActivity(intent)

    }
    private fun navigateToLogin() {
        val intent = Intent(this, LoginPage::class.java)
        startActivity(intent)

    }

}


