package com.awesomeapp.module_3_252

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api252_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api252_3 API"
    }
}