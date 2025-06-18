package com.awesomeapp.module_3_273

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api273_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api273_15 API"
    }
}