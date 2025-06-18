package com.awesomeapp.module_2_192

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api192_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api192_13 API"
    }
}