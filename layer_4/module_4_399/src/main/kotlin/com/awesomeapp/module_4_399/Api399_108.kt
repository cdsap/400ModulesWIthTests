package com.awesomeapp.module_4_399

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api399_108 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api399_108 API"
    }
}