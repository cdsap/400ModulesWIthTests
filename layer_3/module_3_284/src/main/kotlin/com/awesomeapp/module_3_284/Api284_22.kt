package com.awesomeapp.module_3_284

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api284_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api284_22 API"
    }
}