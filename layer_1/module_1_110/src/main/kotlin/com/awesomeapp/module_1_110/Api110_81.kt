package com.awesomeapp.module_1_110

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api110_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api110_81 API"
    }
}