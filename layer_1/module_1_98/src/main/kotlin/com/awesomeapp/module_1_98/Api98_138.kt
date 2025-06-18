package com.awesomeapp.module_1_98

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api98_138 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api98_138 API"
    }
}