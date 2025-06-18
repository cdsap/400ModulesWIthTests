package com.awesomeapp.module_3_304

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api304_55 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api304_55 API"
    }
}