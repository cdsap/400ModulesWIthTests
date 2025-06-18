package com.awesomeapp.module_2_210

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api210_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api210_3 API"
    }
}