package com.awesomeapp.module_0_1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api1_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api1_60 API"
    }
}