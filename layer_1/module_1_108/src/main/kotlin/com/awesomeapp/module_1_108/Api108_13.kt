package com.awesomeapp.module_1_108

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api108_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api108_13 API"
    }
}