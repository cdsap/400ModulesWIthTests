package com.awesomeapp.module_3_310

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api310_144 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api310_144 API"
    }
}