package com.awesomeapp.module_1_114

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api114_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api114_51 API"
    }
}