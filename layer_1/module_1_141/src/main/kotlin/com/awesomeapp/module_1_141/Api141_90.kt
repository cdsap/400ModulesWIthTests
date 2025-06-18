package com.awesomeapp.module_1_141

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api141_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api141_90 API"
    }
}