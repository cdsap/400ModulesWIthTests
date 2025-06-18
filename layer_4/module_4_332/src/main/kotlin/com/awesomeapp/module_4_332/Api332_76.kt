package com.awesomeapp.module_4_332

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api332_76 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api332_76 API"
    }
}