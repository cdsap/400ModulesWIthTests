package com.awesomeapp.module_1_157

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api157_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api157_18 API"
    }
}