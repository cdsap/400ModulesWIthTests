package com.awesomeapp.module_2_181

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api181_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api181_54 API"
    }
}