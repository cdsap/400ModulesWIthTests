package com.awesomeapp.module_0_66

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api66_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api66_51 API"
    }
}