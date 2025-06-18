package com.awesomeapp.module_1_138

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api138_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api138_51 API"
    }
}