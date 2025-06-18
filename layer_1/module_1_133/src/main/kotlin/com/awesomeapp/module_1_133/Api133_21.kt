package com.awesomeapp.module_1_133

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api133_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api133_21 API"
    }
}