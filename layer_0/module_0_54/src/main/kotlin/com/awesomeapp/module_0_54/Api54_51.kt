package com.awesomeapp.module_0_54

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api54_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api54_51 API"
    }
}