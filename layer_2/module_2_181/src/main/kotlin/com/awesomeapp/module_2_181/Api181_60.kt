package com.awesomeapp.module_2_181

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api181_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api181_60 API"
    }
}