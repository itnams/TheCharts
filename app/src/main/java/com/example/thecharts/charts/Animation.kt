package com.example.thecharts.charts

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.TweenSpec

fun simpleChartAnimation(): AnimationSpec<Float> = TweenSpec<Float>(durationMillis = 500)