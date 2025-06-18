package com.awesomeapp.module_3_280

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api280_16 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api280_16 API"
    }
}