package com.awesomeapp.module_2_193

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api193_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api193_42 API"
    }
}