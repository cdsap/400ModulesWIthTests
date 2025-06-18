package com.awesomeapp.module_3_262

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api262_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api262_126 API"
    }
}