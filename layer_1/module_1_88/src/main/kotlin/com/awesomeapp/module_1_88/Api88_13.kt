package com.awesomeapp.module_1_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api88_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api88_13 API"
    }
}