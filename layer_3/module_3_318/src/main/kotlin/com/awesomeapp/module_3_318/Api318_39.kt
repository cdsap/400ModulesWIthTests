package com.awesomeapp.module_3_318

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api318_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api318_39 API"
    }
}