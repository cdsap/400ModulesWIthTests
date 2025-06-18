package com.awesomeapp.module_3_241

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api241_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api241_24 API"
    }
}