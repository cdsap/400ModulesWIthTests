package com.awesomeapp.module_3_248

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api248_76 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api248_76 API"
    }
}