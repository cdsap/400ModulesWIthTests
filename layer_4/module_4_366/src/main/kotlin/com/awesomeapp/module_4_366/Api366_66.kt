package com.awesomeapp.module_4_366

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api366_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api366_66 API"
    }
}