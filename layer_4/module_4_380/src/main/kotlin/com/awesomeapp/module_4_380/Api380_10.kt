package com.awesomeapp.module_4_380

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api380_10 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api380_10 API"
    }
}