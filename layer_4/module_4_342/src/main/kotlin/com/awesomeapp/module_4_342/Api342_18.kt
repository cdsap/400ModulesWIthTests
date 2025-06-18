package com.awesomeapp.module_4_342

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api342_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api342_18 API"
    }
}