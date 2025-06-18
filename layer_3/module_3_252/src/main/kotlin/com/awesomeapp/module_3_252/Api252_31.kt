package com.awesomeapp.module_3_252

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api252_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api252_31 API"
    }
}