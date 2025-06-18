package com.awesomeapp.module_0_11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api11_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api11_12 API"
    }
}