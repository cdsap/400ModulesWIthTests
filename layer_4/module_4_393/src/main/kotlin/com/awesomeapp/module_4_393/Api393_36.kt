package com.awesomeapp.module_4_393

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api393_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api393_36 API"
    }
}