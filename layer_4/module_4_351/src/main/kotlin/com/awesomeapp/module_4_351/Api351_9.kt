package com.awesomeapp.module_4_351

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api351_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api351_9 API"
    }
}