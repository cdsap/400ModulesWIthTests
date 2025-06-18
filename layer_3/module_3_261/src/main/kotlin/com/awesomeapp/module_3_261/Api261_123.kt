package com.awesomeapp.module_3_261

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api261_123 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api261_123 API"
    }
}