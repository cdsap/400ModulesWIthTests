package com.awesomeapp.module_4_393

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api393_129 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api393_129 API"
    }
}