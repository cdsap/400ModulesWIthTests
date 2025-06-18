package com.awesomeapp.module_4_395

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api395_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api395_93 API"
    }
}