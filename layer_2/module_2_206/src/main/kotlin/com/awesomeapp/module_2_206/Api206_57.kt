package com.awesomeapp.module_2_206

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api206_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api206_57 API"
    }
}