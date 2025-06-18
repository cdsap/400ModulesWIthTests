package com.awesomeapp.module_2_211

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api211_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api211_93 API"
    }
}