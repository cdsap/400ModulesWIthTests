package com.awesomeapp.module_3_254

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api254_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api254_9 API"
    }
}