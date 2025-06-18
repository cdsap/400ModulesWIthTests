package com.awesomeapp.module_1_143

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api143_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api143_114 API"
    }
}