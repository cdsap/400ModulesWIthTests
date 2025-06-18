package com.awesomeapp.module_1_85

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api85_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api85_9 API"
    }
}