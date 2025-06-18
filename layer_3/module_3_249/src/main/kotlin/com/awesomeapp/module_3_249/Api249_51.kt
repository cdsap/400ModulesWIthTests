package com.awesomeapp.module_3_249

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api249_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api249_51 API"
    }
}