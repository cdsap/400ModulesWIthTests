package com.awesomeapp.module_3_316

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api316_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api316_3 API"
    }
}