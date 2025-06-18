package com.awesomeapp.module_3_256

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api256_61 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api256_61 API"
    }
}