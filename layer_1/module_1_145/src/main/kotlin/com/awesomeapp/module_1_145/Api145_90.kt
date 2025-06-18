package com.awesomeapp.module_1_145

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api145_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api145_90 API"
    }
}