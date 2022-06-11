package com.burhanrashid52.photoediting.config.use_cases

import com.burhanrashid52.photoediting.config.colors.ColorsConfigData
import com.burhanrashid52.photoediting.utils.use_cases.GetJsonStringFromAssets
import com.google.gson.Gson

class GetColorsConfigData(private val getJsonStringFromAssets: GetJsonStringFromAssets) {

    operator fun invoke(): ColorsConfigData {
        val jsonString = getJsonStringFromAssets("config/colors.json")
        return Gson().fromJson(jsonString, ColorsConfigData::class.java)
    }
}
