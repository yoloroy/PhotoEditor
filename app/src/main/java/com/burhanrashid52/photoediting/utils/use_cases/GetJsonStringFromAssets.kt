package com.burhanrashid52.photoediting.utils.use_cases

import android.content.Context
import java.io.InputStream
import java.nio.charset.Charset

class GetJsonStringFromAssets(private val context: Context) {

    operator fun invoke(fileName: String): String {
        val inputStream: InputStream = context.assets.open(fileName)
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)

        inputStream.read(buffer)
        inputStream.close()

        return String(buffer, Charset.forName("UTF-8"))
    }
}
