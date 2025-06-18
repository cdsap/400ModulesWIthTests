package com.awesomeapp.module_1_82

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api82_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api82_51 API"
    }
}