package com.awesomeapp.module_4_370

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api370_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api370_57 API"
    }
}