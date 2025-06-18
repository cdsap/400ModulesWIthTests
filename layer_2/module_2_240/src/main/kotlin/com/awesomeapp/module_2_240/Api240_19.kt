package com.awesomeapp.module_2_240

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api240_19 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api240_19 API"
    }
}