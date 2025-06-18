package com.awesomeapp.module_1_148

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api148_64 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api148_64 API"
    }
}