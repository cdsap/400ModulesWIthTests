package com.awesomeapp.module_0_30

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api30_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api30_66 API"
    }
}