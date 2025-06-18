package com.awesomeapp.module_2_223

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api223_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api223_96 API"
    }
}