package com.awesomeapp.module_2_161

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api161_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api161_36 API"
    }
}