package com.awesomeapp.module_1_153

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api153_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api153_75 API"
    }
}