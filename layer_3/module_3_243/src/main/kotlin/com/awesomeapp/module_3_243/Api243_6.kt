package com.awesomeapp.module_3_243

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api243_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api243_6 API"
    }
}