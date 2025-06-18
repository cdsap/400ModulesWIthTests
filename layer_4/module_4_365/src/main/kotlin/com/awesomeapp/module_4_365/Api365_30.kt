package com.awesomeapp.module_4_365

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api365_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api365_30 API"
    }
}