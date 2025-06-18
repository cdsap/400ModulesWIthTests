package com.awesomeapp.module_4_332

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api332_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api332_25 API"
    }
}