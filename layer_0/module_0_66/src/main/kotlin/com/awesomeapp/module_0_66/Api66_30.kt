package com.awesomeapp.module_0_66

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api66_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api66_30 API"
    }
}