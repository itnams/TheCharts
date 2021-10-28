package com.example.thecharts

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thecharts.charts.bar.BarChar
import com.example.thecharts.charts.bar.render.label.SimpleLabelDrawer


@Composable
fun BarChartScreen() {
    Scaffold(topBar = {
        TopAppBar(navigationIcon = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back home"
                )
            }
        }, title = { Text(text = "Bar Chart") })
    }) {
        BarChartContent()
    }
}

@Composable
private fun BarChartContent() {
    val barChartDataModel = BarChartDataModel()
    Column(
        modifier = Modifier.padding(
            horizontal = 15.dp,
            vertical = 15.dp
        )
    ) {
        BarChartRow(barChartDataModel = barChartDataModel)
        DrawLabelLocation(
            barChartDataModel = barChartDataModel,
            newLocation = { barChartDataModel.labelLocation = it })
        AddOrRemoveBar(barChartDataModel = barChartDataModel)
    }
}

@Composable
private fun BarChartRow(barChartDataModel: BarChartDataModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .padding(vertical = 30.dp)
    ) {
        BarChar(
            barChartData = barChartDataModel.barChartData,
            labelDrawer = barChartDataModel.labelDrawer
        )
    }
}

@Composable
private fun DrawLabelLocation(
    barChartDataModel: BarChartDataModel,
    newLocation: (SimpleLabelDrawer.DrawLocation) -> Unit
) {
    val labelDrawLocation = remember(barChartDataModel.labelDrawer) {
        barChartDataModel.labelLocation
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 14.dp)
                .align(Alignment.CenterVertically),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            for (location in SimpleLabelDrawer.DrawLocation.values()) {
                OutlinedButton(
                    onClick = { newLocation(location) },
                    border = ButtonDefaults.outlinedBorder.takeIf { labelDrawLocation == location },
                ) {
                    Text(text = location.name)
                }
            }
        }
    }
}

@Composable
private fun AddOrRemoveBar(barChartDataModel: BarChartDataModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(
            onClick = { barChartDataModel.removeBar() },
            enabled = barChartDataModel.bars.size > 1,
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Remove bar from BarChart"
            )
        }

        Row(
            modifier = Modifier.padding(
                horizontal = 14.dp,
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Bars: ")
            Text(
                text = barChartDataModel.bars.size.toString(),
                style = TextStyle(fontWeight = FontWeight.ExtraBold, fontSize = 18.sp)
            )
        }

        Button(
            onClick = { barChartDataModel.addBar() },
            enabled = barChartDataModel.bars.size < 7,
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add bar into BarChart"
            )
        }
    }
}