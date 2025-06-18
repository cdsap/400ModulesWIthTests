package com.awesomeapp.module_1_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api84_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api84_25 API"
    }
}