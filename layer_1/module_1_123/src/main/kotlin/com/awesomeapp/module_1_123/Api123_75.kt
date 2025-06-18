package com.awesomeapp.module_1_123

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api123_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api123_75 API"
    }
}