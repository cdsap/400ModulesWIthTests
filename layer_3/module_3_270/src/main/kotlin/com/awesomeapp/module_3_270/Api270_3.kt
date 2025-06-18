package com.awesomeapp.module_3_270

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api270_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api270_3 API"
    }
}