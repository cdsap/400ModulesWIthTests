package com.awesomeapp.module_1_100

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api100_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api100_31 API"
    }
}