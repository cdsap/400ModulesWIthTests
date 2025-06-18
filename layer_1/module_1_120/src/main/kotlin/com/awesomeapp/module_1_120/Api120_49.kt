package com.awesomeapp.module_1_120

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api120_49 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api120_49 API"
    }
}