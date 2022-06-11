package com.burhanrashid52.photoediting.config.use_cases

import com.burhanrashid52.photoediting.tools.ToolType
import com.burhanrashid52.photoediting.utils.use_cases.GetJsonStringFromAssets
import com.google.gson.Gson

class GetToolNames(private val getJsonStringFromAssets: GetJsonStringFromAssets) {

    operator fun invoke(): ToolNames {
        val jsonString = getJsonStringFromAssets("config/tools_names.json")
        return Gson().fromJson(jsonString, ToolNames::class.java)
    }
}

data class ToolNames(
    val shape: String,
    val text: String,
    val eraser: String,
    val filter: String,
    val emoji: String,
    val sticker: String,
) {
    fun toMap() = mapOf(
        ToolType.SHAPE to shape,
        ToolType.TEXT to text,
        ToolType.ERASER to eraser,
        ToolType.FILTER to filter,
        ToolType.EMOJI to emoji,
        ToolType.STICKER to sticker
    )

    operator fun get(name: ToolType) = toMap()[name]

}
