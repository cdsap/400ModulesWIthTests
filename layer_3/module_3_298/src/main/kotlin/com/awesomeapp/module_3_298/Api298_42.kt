package com.awesomeapp.module_3_298

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api298_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api298_42 API"
    }
}