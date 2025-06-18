package com.awesomeapp.module_4_371

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api371_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api371_96 API"
    }
}