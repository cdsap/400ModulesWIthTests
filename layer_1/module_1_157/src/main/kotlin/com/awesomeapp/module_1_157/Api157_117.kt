package com.awesomeapp.module_1_157

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api157_117 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api157_117 API"
    }
}