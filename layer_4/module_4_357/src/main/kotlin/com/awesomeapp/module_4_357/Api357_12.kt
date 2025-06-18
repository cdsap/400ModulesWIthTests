package com.awesomeapp.module_4_357

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api357_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api357_12 API"
    }
}