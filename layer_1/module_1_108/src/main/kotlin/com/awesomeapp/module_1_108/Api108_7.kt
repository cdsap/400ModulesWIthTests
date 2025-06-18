package com.awesomeapp.module_1_108

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api108_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api108_7 API"
    }
}