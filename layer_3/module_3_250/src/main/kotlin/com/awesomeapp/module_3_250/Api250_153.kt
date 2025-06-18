package com.awesomeapp.module_3_250

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api250_153 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api250_153 API"
    }
}