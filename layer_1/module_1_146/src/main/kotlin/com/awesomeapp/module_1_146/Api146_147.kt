package com.awesomeapp.module_1_146

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api146_147 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api146_147 API"
    }
}