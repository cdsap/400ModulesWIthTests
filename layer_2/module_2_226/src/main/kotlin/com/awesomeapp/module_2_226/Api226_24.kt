package com.awesomeapp.module_2_226

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api226_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api226_24 API"
    }
}