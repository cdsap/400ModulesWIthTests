package com.awesomeapp.module_1_158

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api158_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api158_60 API"
    }
}