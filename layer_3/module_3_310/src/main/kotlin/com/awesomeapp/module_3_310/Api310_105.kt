package com.awesomeapp.module_3_310

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api310_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api310_105 API"
    }
}