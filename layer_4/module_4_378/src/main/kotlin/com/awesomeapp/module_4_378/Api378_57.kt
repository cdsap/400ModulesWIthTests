package com.awesomeapp.module_4_378

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api378_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api378_57 API"
    }
}