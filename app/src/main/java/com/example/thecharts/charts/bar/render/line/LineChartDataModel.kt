//package com.example.thecharts.charts.bar.render.line
//
//import android.graphics.Point
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import com.example.thecharts.charts.data.LineChartData
//
//class LineChartDataModel {
//        var lineChartData by mutableStateOf(
//                LineChartData(
//                points = listOf(
//                    Point(randomYValue(), "Label1"),
//                    Point(randomYValue(), "Label2"),
//                    Point(randomYValue(), "Label3"),
//                    Point(randomYValue(), "Label4"),
//                    Point(randomYValue(), "Label5"),
//                    Point(randomYValue(), "Label6"),
//                    Point(randomYValue(), "Label7")
//                )
//            )
//        )
//        var horizontalOffset by mutableStateOf(5f)
//        var pointDrawerType by mutableStateOf(Filled)
//        val pointDrawer: PointDrawer
//            get() {
//                return when (pointDrawerType) {
//                    None -> NoPointDrawer
//                    Filled -> FilledCircularPointDrawer()
//                    Hollow -> HollowCircularPointDrawer()
//                }
//            }
//
//        private fun randomYValue(): Float = (100f * Math.random()).toFloat() + 45f
//
//        enum class PointDrawerType {
//            None,
//            Filled,
//            Hollow
//        }
//    }