package com.awesomeapp.module_2_219

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api219_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api219_12 API"
    }
}