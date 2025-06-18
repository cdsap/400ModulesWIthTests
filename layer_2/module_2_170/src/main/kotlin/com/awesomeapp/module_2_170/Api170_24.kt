package com.awesomeapp.module_2_170

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api170_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api170_24 API"
    }
}