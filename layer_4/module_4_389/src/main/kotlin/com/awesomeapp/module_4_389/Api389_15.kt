package com.awesomeapp.module_4_389

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api389_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api389_15 API"
    }
}