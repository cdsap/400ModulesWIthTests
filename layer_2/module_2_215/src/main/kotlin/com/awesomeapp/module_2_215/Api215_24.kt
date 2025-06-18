package com.awesomeapp.module_2_215

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api215_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api215_24 API"
    }
}