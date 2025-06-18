package com.awesomeapp.module_0_62

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api62_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api62_63 API"
    }
}