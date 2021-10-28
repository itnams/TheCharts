package com.example.thecharts.charts.bar.render.bar

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.example.thecharts.charts.bar.BarChartData

interface IBarDrawer {
    fun drawBar(drawScope: DrawScope, canvas: Canvas, barArea: Rect, bar: BarChartData.Bar)
}