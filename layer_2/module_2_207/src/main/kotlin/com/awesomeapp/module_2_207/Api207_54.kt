package com.awesomeapp.module_2_207

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api207_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api207_54 API"
    }
}