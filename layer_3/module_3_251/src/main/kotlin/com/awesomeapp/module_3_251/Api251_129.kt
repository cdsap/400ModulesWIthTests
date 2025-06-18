package com.awesomeapp.module_3_251

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api251_129 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api251_129 API"
    }
}