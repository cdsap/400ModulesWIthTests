package com.awesomeapp.module_3_253

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api253_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api253_18 API"
    }
}