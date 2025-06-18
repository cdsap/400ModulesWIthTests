package com.awesomeapp.module_3_258

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api258_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api258_66 API"
    }
}