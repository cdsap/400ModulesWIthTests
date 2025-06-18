package com.awesomeapp.module_4_397

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api397_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api397_21 API"
    }
}