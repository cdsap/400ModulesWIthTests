package com.awesomeapp.module_3_310

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api310_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api310_60 API"
    }
}