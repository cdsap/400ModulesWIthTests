package com.awesomeapp.module_4_360

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api360_169 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api360_169 API"
    }
}