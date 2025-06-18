package com.awesomeapp.module_4_371

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api371_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api371_63 API"
    }
}