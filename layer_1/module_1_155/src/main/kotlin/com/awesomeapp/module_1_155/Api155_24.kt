package com.awesomeapp.module_1_155

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api155_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api155_24 API"
    }
}