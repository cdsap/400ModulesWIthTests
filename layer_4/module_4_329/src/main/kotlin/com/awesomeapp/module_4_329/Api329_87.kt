package com.awesomeapp.module_4_329

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api329_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api329_87 API"
    }
}