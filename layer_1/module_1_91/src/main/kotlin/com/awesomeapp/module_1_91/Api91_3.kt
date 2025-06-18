package com.awesomeapp.module_1_91

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api91_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api91_3 API"
    }
}