package com.awesomeapp.module_2_198

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api198_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api198_105 API"
    }
}