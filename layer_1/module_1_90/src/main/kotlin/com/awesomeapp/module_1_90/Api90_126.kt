package com.awesomeapp.module_1_90

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api90_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api90_126 API"
    }
}