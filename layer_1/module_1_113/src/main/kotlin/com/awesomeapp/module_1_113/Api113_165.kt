package com.awesomeapp.module_1_113

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api113_165 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api113_165 API"
    }
}