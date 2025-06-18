package com.awesomeapp.module_2_234

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api234_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api234_57 API"
    }
}