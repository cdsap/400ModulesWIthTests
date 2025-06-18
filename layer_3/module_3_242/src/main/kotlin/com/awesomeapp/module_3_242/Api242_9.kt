package com.awesomeapp.module_3_242

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api242_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api242_9 API"
    }
}