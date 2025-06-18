package com.awesomeapp.module_2_233

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api233_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api233_9 API"
    }
}