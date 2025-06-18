package com.awesomeapp.module_0_79

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api79_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api79_96 API"
    }
}