package com.awesomeapp.module_1_97

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api97_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api97_3 API"
    }
}