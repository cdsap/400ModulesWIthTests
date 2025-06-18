package com.awesomeapp.module_1_81

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api81_177 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api81_177 API"
    }
}