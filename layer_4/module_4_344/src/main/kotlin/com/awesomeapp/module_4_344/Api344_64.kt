package com.awesomeapp.module_4_344

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api344_64 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api344_64 API"
    }
}