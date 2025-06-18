package com.awesomeapp.module_3_318

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api318_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api318_51 API"
    }
}