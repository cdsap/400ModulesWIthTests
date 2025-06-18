package com.awesomeapp.module_2_206

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api206_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api206_75 API"
    }
}