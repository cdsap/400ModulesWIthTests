package com.awesomeapp.module_4_357

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api357_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api357_81 API"
    }
}