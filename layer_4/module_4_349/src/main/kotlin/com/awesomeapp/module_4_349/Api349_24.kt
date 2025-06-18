package com.awesomeapp.module_4_349

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api349_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api349_24 API"
    }
}