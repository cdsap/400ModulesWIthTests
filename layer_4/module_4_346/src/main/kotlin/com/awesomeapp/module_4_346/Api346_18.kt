package com.awesomeapp.module_4_346

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api346_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api346_18 API"
    }
}