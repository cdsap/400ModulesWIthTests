package com.awesomeapp.module_4_325

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api325_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api325_21 API"
    }
}