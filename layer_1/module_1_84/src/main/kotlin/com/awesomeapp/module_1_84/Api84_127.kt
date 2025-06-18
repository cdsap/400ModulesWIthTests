package com.awesomeapp.module_1_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api84_127 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api84_127 API"
    }
}