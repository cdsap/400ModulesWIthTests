package com.awesomeapp.module_1_142

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api142_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api142_51 API"
    }
}