package com.awesomeapp.module_2_213

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api213_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api213_87 API"
    }
}