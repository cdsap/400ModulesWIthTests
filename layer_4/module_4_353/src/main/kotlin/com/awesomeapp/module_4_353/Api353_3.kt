package com.awesomeapp.module_4_353

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api353_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api353_3 API"
    }
}