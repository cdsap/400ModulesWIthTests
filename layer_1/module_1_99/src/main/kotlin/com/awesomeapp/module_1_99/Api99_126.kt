package com.awesomeapp.module_1_99

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api99_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api99_126 API"
    }
}