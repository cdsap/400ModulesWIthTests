package com.awesomeapp.module_1_86

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api86_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api86_51 API"
    }
}