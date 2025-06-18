package com.awesomeapp.module_2_232

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api232_121 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api232_121 API"
    }
}