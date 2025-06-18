package com.awesomeapp.module_3_249

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api249_168 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api249_168 API"
    }
}