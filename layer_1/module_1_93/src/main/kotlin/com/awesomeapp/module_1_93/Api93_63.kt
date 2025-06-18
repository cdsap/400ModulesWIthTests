package com.awesomeapp.module_1_93

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api93_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api93_63 API"
    }
}