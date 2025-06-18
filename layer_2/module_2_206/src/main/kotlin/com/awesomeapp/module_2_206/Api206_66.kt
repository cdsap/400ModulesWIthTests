package com.awesomeapp.module_2_206

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api206_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api206_66 API"
    }
}