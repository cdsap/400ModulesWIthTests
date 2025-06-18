package com.awesomeapp.module_1_155

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api155_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api155_3 API"
    }
}