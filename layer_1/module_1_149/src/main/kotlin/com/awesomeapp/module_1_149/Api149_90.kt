package com.awesomeapp.module_1_149

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api149_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api149_90 API"
    }
}