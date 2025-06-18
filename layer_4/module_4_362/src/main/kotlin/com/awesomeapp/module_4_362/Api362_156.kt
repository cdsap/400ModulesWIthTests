package com.awesomeapp.module_4_362

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api362_156 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api362_156 API"
    }
}