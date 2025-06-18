package com.awesomeapp.module_1_137

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api137_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api137_36 API"
    }
}