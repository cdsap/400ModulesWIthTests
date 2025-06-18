package com.awesomeapp.module_0_23

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api23_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api23_42 API"
    }
}