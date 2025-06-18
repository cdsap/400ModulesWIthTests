package com.awesomeapp.module_1_130

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api130_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api130_9 API"
    }
}