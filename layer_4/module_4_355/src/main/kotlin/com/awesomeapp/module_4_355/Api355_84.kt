package com.awesomeapp.module_4_355

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api355_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api355_84 API"
    }
}