package com.awesomeapp.module_4_325

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api325_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api325_3 API"
    }
}