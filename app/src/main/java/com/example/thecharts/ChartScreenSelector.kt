package com.example.thecharts

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.thecharts.charts.bar.BarChar


@Composable
fun BarChartScreen() {
    BarChartContent()
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
sealed class ChartScreen {
    object SelectChart : ChartScreen()
    object Pie : ChartScreen()
    object Bar : ChartScreen()
    object Line : ChartScreen()
}
object ChartScreenStatus {
    var currentChart by mutableStateOf<ChartScreen>(ChartScreen.SelectChart)
        private set

    fun navigateTo(screen: ChartScreen) {
        currentChart = screen
    }

    fun navigateHome() {
        navigateTo(ChartScreen.SelectChart)
    }
}