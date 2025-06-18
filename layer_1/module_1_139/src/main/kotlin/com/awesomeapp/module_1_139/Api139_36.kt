package com.awesomeapp.module_1_139

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api139_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api139_36 API"
    }
}