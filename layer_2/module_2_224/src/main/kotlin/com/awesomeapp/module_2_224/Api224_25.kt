package com.awesomeapp.module_2_224

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api224_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api224_25 API"
    }
}