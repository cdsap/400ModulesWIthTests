package com.awesomeapp.module_4_375

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api375_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api375_18 API"
    }
}