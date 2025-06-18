package com.awesomeapp.module_1_102

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api102_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api102_96 API"
    }
}