package com.awesomeapp.module_0_75

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api75_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api75_33 API"
    }
}