package com.example.thecharts.charts.bar.render.bar

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.example.thecharts.charts.bar.BarChartData

class SimpleBarDrawer : IBarDrawer {
    private val mBarPaint by lazy { Paint().apply { isAntiAlias = true } }

    override fun drawBar(
        drawScope: DrawScope,
        canvas: Canvas,
        barArea: Rect,
        bar: BarChartData.Bar
    ) {
        canvas.drawRect(barArea, mBarPaint.apply { color = bar.color })
    }
}
