package com.awesomeapp.module_2_199

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api199_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api199_6 API"
    }
}