package com.awesomeapp.module_4_358

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api358_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api358_63 API"
    }
}