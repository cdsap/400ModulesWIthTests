package com.awesomeapp.module_2_212

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api212_148 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api212_148 API"
    }
}