package com.awesomeapp.module_4_333

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api333_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api333_60 API"
    }
}