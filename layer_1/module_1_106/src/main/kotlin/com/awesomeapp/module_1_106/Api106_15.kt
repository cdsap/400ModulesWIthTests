package com.awesomeapp.module_1_106

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api106_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api106_15 API"
    }
}