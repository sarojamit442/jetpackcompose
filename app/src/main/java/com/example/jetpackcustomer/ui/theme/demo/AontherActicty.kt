package com.example.jetpackcustomer.ui.theme.demo

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcustomer.R

class AontherActicty : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // BoxLayout()

            // How to make compose methode in cliclister , textview and imagview etc

            //  Textview11()
            //  Edittexr

        }
    }

    @Preview(showBackground = false, showSystemUi = false)
    @Composable
    fun BoxLayout() {
        val context = LocalContext.current

        Box {
            Image(
                painter = painterResource(id = R.drawable.background_image_header),
                contentDescription = "demo"
            )
            Text(text = "login,")
            Column(

            )
            {
                Button(onClick = {
                    Toast.makeText(
                        context, "mmm", Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Text(text = "username")

                }
            }
        }
    }

    @Composable
    fun Textview11() {
        val context = LocalContext.current

        Text(text = "Call Toast messag in", modifier = Modifier.clickable {
            Toast.makeText(
                context, "mmm", Toast.LENGTH_SHORT
            ).show()
        })
    }

    @Composable
    fun Edittexr() {
        TextField(value = "Hello Cheegycode", onValueChange = {})
    }


}

@Composable
fun CenteredTextInColumn() {
    Column(
        modifier = Modifier.fillMaxSize(), // Fill the available space
        verticalArrangement = Arrangement.Center, // Center vertically
        horizontalAlignment = Alignment.CenterHorizontally // Center horizontally
    ) {
        Text(text = "Centered Text", style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun CustomDashBorderExample() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .padding(16.dp)
            .drawWithContent {
                drawContent()
                drawRect(
                    color = Color.Green,
                    size = size.copy(50f, 50f),  // Custom size for the border
                    style = Stroke(4f)  // Border thickness
                )
            }
    ) {
        Text("Dashed Border", modifier = Modifier.align(Alignment.Center))
    }
}

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun Border() {
    Column(modifier = Modifier.padding(start = 10.dp, top = 20.dp)) {
        Card(
            modifier = Modifier.size(100.dp),
            shape = RectangleShape,
            border = BorderStroke(1.dp, Color.Blue),
        ) {
        Box(modifier = Modifier.padding(8.dp).fillMaxSize(), contentAlignment = Alignment.Center){
          Text(text = "asdfghjk")
        }
        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Card(
            modifier = Modifier.size(100.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp, Color.Blue)
        ) {

        }

        Spacer(modifier = Modifier.padding(top = 10.dp))
        Card(
            modifier = Modifier.size(100.dp),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Blue)
        ) {

        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Card(
            modifier = Modifier.size(100.dp),
            shape = CutCornerShape(12.dp),
            border = BorderStroke(1.dp, Color.Blue)
        ) {

        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Card(
            modifier = Modifier.size(100.dp),
            shape = AbsoluteCutCornerShape(12.dp),
            border = BorderStroke(1.dp, Color.Blue)
        ) {

        }


    }


}
