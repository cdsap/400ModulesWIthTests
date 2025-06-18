package com.awesomeapp.module_0_68

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api68_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api68_13 API"
    }
}