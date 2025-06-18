package com.awesomeapp.module_0_22

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api22_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api22_39 API"
    }
}