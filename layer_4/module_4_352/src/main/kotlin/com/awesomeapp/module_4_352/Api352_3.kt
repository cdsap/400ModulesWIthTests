package com.awesomeapp.module_4_352

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api352_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api352_3 API"
    }
}