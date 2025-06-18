package com.awesomeapp.module_3_274

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api274_45 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api274_45 API"
    }
}