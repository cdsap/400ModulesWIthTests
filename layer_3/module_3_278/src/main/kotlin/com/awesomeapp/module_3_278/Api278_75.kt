package com.awesomeapp.module_3_278

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api278_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api278_75 API"
    }
}