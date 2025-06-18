package com.awesomeapp.module_2_240

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api240_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api240_13 API"
    }
}