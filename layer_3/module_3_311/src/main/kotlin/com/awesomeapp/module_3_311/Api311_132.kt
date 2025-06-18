package com.awesomeapp.module_3_311

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api311_132 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api311_132 API"
    }
}