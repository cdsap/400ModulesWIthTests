package com.awesomeapp.module_3_295

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api295_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api295_99 API"
    }
}