package com.awesomeapp.module_1_160

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api160_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api160_25 API"
    }
}