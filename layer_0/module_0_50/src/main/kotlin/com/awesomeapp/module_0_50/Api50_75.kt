package com.awesomeapp.module_0_50

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api50_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api50_75 API"
    }
}