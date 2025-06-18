package com.awesomeapp.module_1_129

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api129_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api129_12 API"
    }
}