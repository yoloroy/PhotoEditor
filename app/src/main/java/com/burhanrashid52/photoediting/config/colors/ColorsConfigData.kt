package com.burhanrashid52.photoediting.config.colors

import android.graphics.Color

data class ColorsConfigData(
    private val backgroundColor: String,
    private val toolsPanelColor: String
) {
    val backgroundColorInt get() = Color.parseColor(backgroundColor)
    val toolsPanelColorInt get() = Color.parseColor(toolsPanelColor)
}
