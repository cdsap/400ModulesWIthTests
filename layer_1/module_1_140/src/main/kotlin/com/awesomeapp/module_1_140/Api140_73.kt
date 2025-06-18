package com.awesomeapp.module_1_140

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api140_73 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api140_73 API"
    }
}