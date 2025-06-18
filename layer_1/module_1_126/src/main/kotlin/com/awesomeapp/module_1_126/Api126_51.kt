package com.awesomeapp.module_1_126

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api126_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api126_51 API"
    }
}