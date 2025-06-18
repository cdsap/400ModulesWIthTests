package com.awesomeapp.module_1_126

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api126_108 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api126_108 API"
    }
}