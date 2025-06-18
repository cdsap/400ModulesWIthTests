package com.awesomeapp.module_1_150

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api150_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api150_3 API"
    }
}