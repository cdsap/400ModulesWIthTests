package com.awesomeapp.module_1_95

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api95_72 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api95_72 API"
    }
}