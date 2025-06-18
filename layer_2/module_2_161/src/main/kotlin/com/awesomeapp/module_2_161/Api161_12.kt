package com.awesomeapp.module_2_161

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api161_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api161_12 API"
    }
}