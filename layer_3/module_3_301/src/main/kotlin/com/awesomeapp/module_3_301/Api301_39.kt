package com.awesomeapp.module_3_301

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api301_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api301_39 API"
    }
}