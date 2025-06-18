package com.awesomeapp.module_3_247

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api247_123 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api247_123 API"
    }
}