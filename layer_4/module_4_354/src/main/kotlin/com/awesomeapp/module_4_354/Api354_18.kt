package com.awesomeapp.module_4_354

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api354_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api354_18 API"
    }
}