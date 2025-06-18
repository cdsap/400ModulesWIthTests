package com.awesomeapp.module_3_269

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api269_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api269_75 API"
    }
}