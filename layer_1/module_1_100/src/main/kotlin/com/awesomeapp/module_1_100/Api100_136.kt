package com.awesomeapp.module_1_100

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api100_136 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api100_136 API"
    }
}