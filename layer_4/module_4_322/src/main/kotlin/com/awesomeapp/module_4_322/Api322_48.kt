package com.awesomeapp.module_4_322

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api322_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api322_48 API"
    }
}