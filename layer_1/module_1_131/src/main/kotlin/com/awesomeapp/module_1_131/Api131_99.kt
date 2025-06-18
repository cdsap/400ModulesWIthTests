package com.awesomeapp.module_1_131

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api131_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api131_99 API"
    }
}