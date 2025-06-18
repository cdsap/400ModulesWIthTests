package com.awesomeapp.module_4_371

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api371_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api371_60 API"
    }
}