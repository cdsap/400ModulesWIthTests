package com.awesomeapp.module_3_299

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api299_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api299_15 API"
    }
}