package com.awesomeapp.module_2_184

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api184_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api184_31 API"
    }
}