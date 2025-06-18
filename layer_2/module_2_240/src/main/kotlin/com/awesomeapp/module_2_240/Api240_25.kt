package com.awesomeapp.module_2_240

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api240_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api240_25 API"
    }
}