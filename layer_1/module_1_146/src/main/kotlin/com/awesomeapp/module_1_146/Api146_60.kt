package com.awesomeapp.module_1_146

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api146_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api146_60 API"
    }
}