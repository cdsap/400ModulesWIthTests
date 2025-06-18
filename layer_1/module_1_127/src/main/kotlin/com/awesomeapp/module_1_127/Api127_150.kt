package com.awesomeapp.module_1_127

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api127_150 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api127_150 API"
    }
}