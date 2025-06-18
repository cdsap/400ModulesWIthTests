package com.awesomeapp.module_4_390

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api390_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api390_3 API"
    }
}