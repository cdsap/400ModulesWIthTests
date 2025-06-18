package com.awesomeapp.module_4_379

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api379_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api379_51 API"
    }
}