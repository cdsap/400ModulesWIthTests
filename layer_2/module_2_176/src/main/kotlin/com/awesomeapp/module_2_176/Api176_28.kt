package com.awesomeapp.module_2_176

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api176_28 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api176_28 API"
    }
}