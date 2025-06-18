package com.awesomeapp.module_1_148

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api148_16 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api148_16 API"
    }
}