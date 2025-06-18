package com.awesomeapp.module_1_143

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api143_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api143_18 API"
    }
}