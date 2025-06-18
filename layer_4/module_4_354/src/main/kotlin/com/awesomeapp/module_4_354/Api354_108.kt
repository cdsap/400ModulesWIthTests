package com.awesomeapp.module_4_354

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api354_108 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api354_108 API"
    }
}