package com.awesomeapp.module_2_196

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api196_100 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api196_100 API"
    }
}