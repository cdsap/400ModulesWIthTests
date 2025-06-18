package com.awesomeapp.module_3_270

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api270_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api270_42 API"
    }
}