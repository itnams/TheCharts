package com.example.thecharts.charts.bar.render.xaxis

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.drawscope.DrawScope

interface IXAxisDrawer {
    fun requiredHeight(drawScope: DrawScope): Float
    fun drawXAxisLine(drawScope: DrawScope, canvas: Canvas, drawableArea: Rect)
}