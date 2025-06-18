package com.awesomeapp.module_0_38

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api38_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api38_84 API"
    }
}