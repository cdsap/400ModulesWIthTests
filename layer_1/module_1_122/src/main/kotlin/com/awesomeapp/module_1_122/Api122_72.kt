package com.awesomeapp.module_1_122

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api122_72 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api122_72 API"
    }
}