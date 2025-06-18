package com.awesomeapp.module_5_401

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api401_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api401_15 API"
    }
}