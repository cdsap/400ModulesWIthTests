package com.awesomeapp.module_4_385

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api385_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api385_96 API"
    }
}