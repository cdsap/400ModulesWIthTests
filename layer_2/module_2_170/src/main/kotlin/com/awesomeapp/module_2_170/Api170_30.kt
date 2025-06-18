package com.awesomeapp.module_2_170

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api170_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api170_30 API"
    }
}