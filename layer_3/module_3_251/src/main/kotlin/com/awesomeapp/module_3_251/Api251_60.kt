package com.awesomeapp.module_3_251

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api251_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api251_60 API"
    }
}