package com.awesomeapp.module_3_262

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api262_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api262_27 API"
    }
}