//package com.example.thecharts.charts.bar.render.line
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//@Composable
//fun LineChartScreen() {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                navigationIcon = {
//                    IconButton(onClick = { }) {
//                        Icon(Icons.Filled.ArrowBack, contentDescription = "Go back to home")
//                    }
//                },
//                title = { Text(text = "Line Chart") }
//            )
//        },
//    ) { LineChartScreenContent() }
//}
//
//@Composable
//fun LineChartScreenContent() {
//    val lineChartDataModel = LineChartDataModel()
//
//    Column(
//        modifier = Modifier.padding(
//            horizontal = 12.dp,
//            vertical = 8.dp
//        )
//    ) {
//        LineChartRow(lineChartDataModel)
//        HorizontalOffsetSelector(lineChartDataModel)
//        OffsetProgress(lineChartDataModel)
//    }
//}
//
//@Composable
//fun HorizontalOffsetSelector(lineChartDataModel: LineChartDataModel) {
//    val selectedType = lineChartDataModel.pointDrawerType
//
//    Row(
//        modifier = Modifier.padding(
//            horizontal = 12.dp,
//            vertical = 8.dp
//        ),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text("Point Drawer")
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 12.dp, vertical = 8.dp)
//                .align(Alignment.CenterVertically)
//        ) {
//            PointDrawerType.values().forEach { type ->
//                OutlinedButton(
//                    border = ButtonDefaults.outlinedBorder.takeIf { selectedType == type },
//                    onClick = { lineChartDataModel.pointDrawerType = type }
//                ) {
//                    Text(type.name)
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun OffsetProgress(lineChartDataModel: LineChartDataModel) {
//    Row(
//        modifier = Modifier.padding(horizontal = horizontal),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text("Offset")
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            modifier = Modifier
//                .fillMaxWidth()
//                .align(Alignment.CenterVertically)
//        ) {
//            Slider(
//                value = lineChartDataModel.horizontalOffset,
//                onValueChange = { lineChartDataModel.horizontalOffset = it },
//                valueRange = 0f.rangeTo(25f)
//            )
//        }
//    }
//}
//
//@Composable
//fun LineChartRow(lineChartDataModel: LineChartDataModel) {
//    Box(
//        modifier = Modifier
//            .height(250.dp)
//            .fillMaxWidth()
//    ) {
//        LineChart(
//            lineChartData = lineChartDataModel.lineChartData,
//            horizontalOffset = lineChartDataModel.horizontalOffset,
//            pointDrawer = lineChartDataModel.pointDrawer
//        )
//    }
//}
//
//@Preview
//@Composable
//fun LineChartPreview() = LineChartScreen()