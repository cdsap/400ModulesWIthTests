package com.awesomeapp.module_4_384

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api384_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api384_3 API"
    }
}