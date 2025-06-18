package com.awesomeapp.module_2_177

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api177_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api177_21 API"
    }
}