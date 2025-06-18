package com.awesomeapp.module_2_177

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api177_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api177_42 API"
    }
}