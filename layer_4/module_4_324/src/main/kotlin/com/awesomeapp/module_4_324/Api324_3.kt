package com.awesomeapp.module_4_324

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api324_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api324_3 API"
    }
}