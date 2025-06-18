package com.awesomeapp.module_0_11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api11_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api11_39 API"
    }
}