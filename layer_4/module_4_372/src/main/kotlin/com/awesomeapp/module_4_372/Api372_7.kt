package com.awesomeapp.module_4_372

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api372_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api372_7 API"
    }
}