package com.awesomeapp.module_4_360

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api360_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api360_31 API"
    }
}