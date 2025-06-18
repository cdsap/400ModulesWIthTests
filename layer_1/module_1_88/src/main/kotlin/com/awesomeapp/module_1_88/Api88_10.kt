package com.awesomeapp.module_1_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api88_10 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api88_10 API"
    }
}