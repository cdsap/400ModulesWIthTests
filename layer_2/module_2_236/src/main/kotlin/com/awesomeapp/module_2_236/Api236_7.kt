package com.awesomeapp.module_2_236

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api236_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api236_7 API"
    }
}