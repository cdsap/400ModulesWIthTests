package com.awesomeapp.module_3_295

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api295_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api295_27 API"
    }
}