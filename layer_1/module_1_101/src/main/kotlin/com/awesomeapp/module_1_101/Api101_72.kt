package com.awesomeapp.module_1_101

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api101_72 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api101_72 API"
    }
}