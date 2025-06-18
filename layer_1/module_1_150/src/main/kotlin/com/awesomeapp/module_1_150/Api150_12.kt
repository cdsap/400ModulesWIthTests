package com.awesomeapp.module_1_150

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api150_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api150_12 API"
    }
}