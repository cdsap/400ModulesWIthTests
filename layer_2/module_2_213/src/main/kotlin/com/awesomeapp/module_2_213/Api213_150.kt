package com.awesomeapp.module_2_213

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api213_150 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api213_150 API"
    }
}