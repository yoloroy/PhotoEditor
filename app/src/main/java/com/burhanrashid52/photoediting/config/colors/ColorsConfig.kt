package com.burhanrashid52.photoediting.config.colors

import com.burhanrashid52.photoediting.config.use_cases.GetColorsConfigData

interface ColorsConfig {

    val backgroundColor: Int
    val toolsPanelColor: Int

    class Base(getColorsConfigData: GetColorsConfigData) : ColorsConfig {

        override val backgroundColor: Int
        override val toolsPanelColor: Int

        init {
            getColorsConfigData().let {
                backgroundColor = it.backgroundColorInt
                toolsPanelColor = it.toolsPanelColorInt
            }
        }
    }
}
