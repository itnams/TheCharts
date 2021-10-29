package com.example.thecharts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thecharts.ui.theme.TheChartsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheChartsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
   Column(
       modifier = Modifier.fillMaxWidth()
   ) {
       BarChartScreen()
      Row(
          horizontalArrangement= Arrangement.SpaceBetween,
          modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f),
       ) {
          Card(
              shape = RoundedCornerShape(16.dp),
              modifier = Modifier
                  .padding(8.dp)
                  .fillMaxWidth(0.49f),
              backgroundColor = Yellow
          ) {
              Column(
                  modifier = Modifier
                      .padding(8.dp)
              ) {
                  Text(text = "Lead", fontSize = 25.sp,fontWeight = FontWeight.Bold)
                  LazyColumn( modifier = Modifier.padding(8.dp)){
                      items(10){ it ->
                          Text(text = "Lead $it",modifier = Modifier.fillMaxWidth(), fontSize = 18.sp, fontWeight = FontWeight.Light)
                      }
                  }
              }
          }
          Card(
              shape = RoundedCornerShape(16.dp),
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(bottom = 8.dp, top = 8.dp, end = 8.dp),
              backgroundColor = LightGray
          ) {
              Column(
                  modifier = Modifier
                      .padding(8.dp)
              ) {
                  Text(text = "Flow up", fontSize = 25.sp,fontWeight = FontWeight.Bold)
                  LazyColumn( modifier = Modifier.padding(8.dp)){
                      items(10){ it ->
                          Text(text = "Flow up $it",modifier = Modifier.fillMaxWidth(), fontSize = 18.sp, fontWeight = FontWeight.Light)
                      }
                  }
              }
          }
      }
       Card(
           shape = RoundedCornerShape(16.dp),
           modifier = Modifier
               .padding(8.dp)
               .fillMaxWidth(),
           backgroundColor = Green
       ) {
           Column(
               modifier = Modifier
                   .padding(8.dp)
           ) {
               Text(text = "Appointment", fontSize = 25.sp,fontWeight = FontWeight.Bold)
               LazyColumn( modifier = Modifier.padding(8.dp)){
                   items(10){ it ->
                       Text(text = "Appointment $it",modifier = Modifier.fillMaxWidth(), fontSize = 18.sp, fontWeight = FontWeight.Light)
                   }
               }
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheChartsTheme {
        Greeting("Android")
    }
}