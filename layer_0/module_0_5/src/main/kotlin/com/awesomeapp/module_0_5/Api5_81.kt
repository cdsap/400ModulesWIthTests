package com.awesomeapp.module_0_5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api5_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api5_81 API"
    }
}