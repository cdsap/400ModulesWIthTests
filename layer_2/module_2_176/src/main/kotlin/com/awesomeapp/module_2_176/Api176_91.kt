package com.awesomeapp.module_2_176

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api176_91 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api176_91 API"
    }
}