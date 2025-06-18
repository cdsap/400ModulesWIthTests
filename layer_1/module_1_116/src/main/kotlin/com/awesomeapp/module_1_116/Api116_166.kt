package com.awesomeapp.module_1_116

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api116_166 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api116_166 API"
    }
}