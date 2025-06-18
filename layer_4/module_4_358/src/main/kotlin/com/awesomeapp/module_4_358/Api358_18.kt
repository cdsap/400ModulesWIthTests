package com.awesomeapp.module_4_358

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api358_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api358_18 API"
    }
}