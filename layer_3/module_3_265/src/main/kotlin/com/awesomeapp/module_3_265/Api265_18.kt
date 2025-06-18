package com.awesomeapp.module_3_265

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api265_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api265_18 API"
    }
}