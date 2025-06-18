package com.awesomeapp.module_4_368

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api368_49 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api368_49 API"
    }
}