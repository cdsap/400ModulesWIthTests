package com.awesomeapp.module_4_398

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api398_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api398_27 API"
    }
}