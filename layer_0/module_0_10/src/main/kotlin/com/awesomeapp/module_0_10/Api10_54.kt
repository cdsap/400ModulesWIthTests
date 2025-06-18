package com.awesomeapp.module_0_10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api10_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api10_54 API"
    }
}