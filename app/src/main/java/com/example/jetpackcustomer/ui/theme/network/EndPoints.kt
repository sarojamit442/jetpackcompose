package com.example.jetpackcustomer.ui.theme.network
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.ImeAction

 object EndPoints {
     val GET_COUNTRY = "common/getCountry/"


     @Composable
     fun PinView(
         modifier: Modifier = Modifier,
         pinLength: Int = 4,
         onPinChanged: (String) -> Unit
     ) {
         var pin by remember { mutableStateOf(TextFieldValue("")) }

         Row(
             modifier = modifier,
             horizontalArrangement = Arrangement.spacedBy(8.dp),
             verticalAlignment = Alignment.CenterVertically
         ) {
             for (i in 0 until pinLength) {
                 BasicTextField(
                     value = pin.text.getOrElse(i) { ' ' }.toString(),
                     onValueChange = { newValue ->
                         if (newValue.length <= 1) {
                             val newPin = pin.text.replaceRange(i, i + 1, newValue)
                             pin = TextFieldValue(newPin)
                             onPinChanged(pin.text)
                         }
                     },
                     singleLine = true,
                     keyboardOptions = KeyboardOptions.Default.copy(
                         keyboardType = KeyboardType.Number,
                         imeAction = ImeAction.Done
                     ),
                     modifier = Modifier
                         .width(50.dp)
                         .height(50.dp)
                         .border(1.dp, Color.Gray)  // Border color and width
                         .padding(10.dp),
                 )
             }
         }
     }


 }