package com.awesomeapp.module_3_282

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api282_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api282_30 API"
    }
}