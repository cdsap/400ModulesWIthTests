package com.awesomeapp.module_4_384

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api384_82 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api384_82 API"
    }
}