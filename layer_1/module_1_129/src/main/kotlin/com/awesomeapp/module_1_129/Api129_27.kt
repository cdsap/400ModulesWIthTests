package com.awesomeapp.module_1_129

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api129_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api129_27 API"
    }
}