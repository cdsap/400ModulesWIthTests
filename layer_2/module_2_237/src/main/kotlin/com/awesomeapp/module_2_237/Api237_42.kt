package com.awesomeapp.module_2_237

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api237_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api237_42 API"
    }
}