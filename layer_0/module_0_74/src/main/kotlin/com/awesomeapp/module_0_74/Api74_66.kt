package com.awesomeapp.module_0_74

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api74_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api74_66 API"
    }
}