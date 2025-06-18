package com.awesomeapp.module_1_97

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api97_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api97_15 API"
    }
}