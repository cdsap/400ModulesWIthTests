package com.awesomeapp.module_1_99

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api99_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api99_18 API"
    }
}