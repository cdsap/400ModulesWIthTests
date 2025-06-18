package com.awesomeapp.module_3_269

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api269_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api269_9 API"
    }
}