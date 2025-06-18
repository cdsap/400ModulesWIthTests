package com.awesomeapp.module_0_22

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api22_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api22_6 API"
    }
}