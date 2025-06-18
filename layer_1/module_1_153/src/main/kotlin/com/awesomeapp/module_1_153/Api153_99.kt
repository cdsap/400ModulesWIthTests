package com.awesomeapp.module_1_153

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api153_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api153_99 API"
    }
}