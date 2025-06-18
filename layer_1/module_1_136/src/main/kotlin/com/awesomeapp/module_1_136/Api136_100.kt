package com.awesomeapp.module_1_136

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api136_100 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api136_100 API"
    }
}