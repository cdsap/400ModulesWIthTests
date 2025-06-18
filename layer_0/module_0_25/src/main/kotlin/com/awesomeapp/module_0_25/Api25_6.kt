package com.awesomeapp.module_0_25

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api25_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api25_6 API"
    }
}