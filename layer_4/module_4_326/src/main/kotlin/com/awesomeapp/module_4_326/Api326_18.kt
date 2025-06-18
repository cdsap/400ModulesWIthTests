package com.awesomeapp.module_4_326

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api326_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api326_18 API"
    }
}