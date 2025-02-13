package com.example.jetpackcustomer.ui.theme.customer.auth.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcustomer.R

@Preview()
@Composable
fun callScreen() {
    Screen(img = R.drawable.checkbox_unfilled, name = "list implement", below = "below Line")
}

@Composable
fun Screen(img: Int, name: String, below: String) {
    Card(modifier = Modifier.padding(8.dp)) {
        Row {
            Image(
                painter = painterResource(id = img),
                contentDescription = ""
            )
            Column() {
                Text(text = name, style = TextStyle(fontSize = 20.sp))
            }
        }
    }


}
