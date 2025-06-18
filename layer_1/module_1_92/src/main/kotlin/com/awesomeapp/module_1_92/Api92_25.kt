package com.awesomeapp.module_1_92

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api92_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api92_25 API"
    }
}