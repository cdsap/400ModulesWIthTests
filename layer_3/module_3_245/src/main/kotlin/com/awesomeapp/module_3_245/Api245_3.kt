package com.awesomeapp.module_3_245

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api245_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api245_3 API"
    }
}