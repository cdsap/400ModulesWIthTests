package com.awesomeapp.module_2_216

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api216_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api216_22 API"
    }
}