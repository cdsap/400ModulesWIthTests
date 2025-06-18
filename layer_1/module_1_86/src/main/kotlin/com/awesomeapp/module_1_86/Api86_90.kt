package com.awesomeapp.module_1_86

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api86_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api86_90 API"
    }
}