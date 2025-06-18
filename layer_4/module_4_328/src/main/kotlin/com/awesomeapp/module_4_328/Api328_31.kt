package com.awesomeapp.module_4_328

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api328_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api328_31 API"
    }
}