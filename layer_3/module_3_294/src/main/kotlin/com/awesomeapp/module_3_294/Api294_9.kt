package com.awesomeapp.module_3_294

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api294_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api294_9 API"
    }
}