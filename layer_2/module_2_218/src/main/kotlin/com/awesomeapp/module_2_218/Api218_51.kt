package com.awesomeapp.module_2_218

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api218_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api218_51 API"
    }
}