package com.awesomeapp.module_1_128

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api128_10 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api128_10 API"
    }
}