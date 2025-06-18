package com.awesomeapp.module_3_262

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api262_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api262_114 API"
    }
}