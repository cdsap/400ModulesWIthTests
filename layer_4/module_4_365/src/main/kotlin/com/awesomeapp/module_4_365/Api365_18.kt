package com.awesomeapp.module_4_365

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api365_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api365_18 API"
    }
}