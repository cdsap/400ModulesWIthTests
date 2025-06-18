package com.awesomeapp.module_4_376

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api376_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api376_22 API"
    }
}