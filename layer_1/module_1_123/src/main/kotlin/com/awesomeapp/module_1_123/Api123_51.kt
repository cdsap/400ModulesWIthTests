package com.awesomeapp.module_1_123

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api123_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api123_51 API"
    }
}