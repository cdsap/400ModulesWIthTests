package com.awesomeapp.module_2_177

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api177_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api177_66 API"
    }
}