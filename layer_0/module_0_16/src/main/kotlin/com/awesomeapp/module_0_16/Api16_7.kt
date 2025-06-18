package com.awesomeapp.module_0_16

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api16_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api16_7 API"
    }
}