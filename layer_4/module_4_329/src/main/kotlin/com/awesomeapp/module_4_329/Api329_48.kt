package com.awesomeapp.module_4_329

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api329_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api329_48 API"
    }
}