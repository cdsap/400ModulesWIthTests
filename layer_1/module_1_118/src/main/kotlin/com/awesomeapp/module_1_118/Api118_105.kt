package com.awesomeapp.module_1_118

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api118_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api118_105 API"
    }
}