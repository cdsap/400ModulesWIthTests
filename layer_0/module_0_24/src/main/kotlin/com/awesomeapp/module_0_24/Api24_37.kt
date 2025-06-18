package com.awesomeapp.module_0_24

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api24_37 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api24_37 API"
    }
}