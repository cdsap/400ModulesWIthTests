package com.awesomeapp.module_2_207

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api207_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api207_114 API"
    }
}