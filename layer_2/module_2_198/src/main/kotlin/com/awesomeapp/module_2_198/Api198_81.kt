package com.awesomeapp.module_2_198

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api198_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api198_81 API"
    }
}