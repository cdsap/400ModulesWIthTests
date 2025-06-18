package com.awesomeapp.module_2_195

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api195_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api195_24 API"
    }
}