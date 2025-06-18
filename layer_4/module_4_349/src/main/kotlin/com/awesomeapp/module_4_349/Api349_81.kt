package com.awesomeapp.module_4_349

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api349_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api349_81 API"
    }
}