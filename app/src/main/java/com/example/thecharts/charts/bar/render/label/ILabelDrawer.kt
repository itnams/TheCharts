package com.example.thecharts.charts.bar.render.label

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.drawscope.DrawScope

interface ILabelDrawer {
    fun requiredXAxisHeight(drawScope: DrawScope): Float = 0F
    fun requiredAboveBarHeight(drawScope: DrawScope): Float = 0F
    fun drawLabel(
        drawScope: DrawScope,
        canvas: Canvas,
        label: String,
        barArea: Rect,
        xAxisArea: Rect
    )
}