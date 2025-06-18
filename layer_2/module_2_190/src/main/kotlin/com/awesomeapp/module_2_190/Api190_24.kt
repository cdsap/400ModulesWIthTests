package com.awesomeapp.module_2_190

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api190_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api190_24 API"
    }
}