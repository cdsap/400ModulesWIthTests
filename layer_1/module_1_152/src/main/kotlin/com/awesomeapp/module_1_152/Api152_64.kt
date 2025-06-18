package com.awesomeapp.module_1_152

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api152_64 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api152_64 API"
    }
}