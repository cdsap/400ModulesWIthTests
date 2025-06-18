package com.awesomeapp.module_4_391

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api391_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api391_36 API"
    }
}