package com.awesomeapp.module_2_211

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api211_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api211_6 API"
    }
}