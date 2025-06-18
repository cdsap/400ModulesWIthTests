package com.awesomeapp.module_1_109

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api109_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api109_105 API"
    }
}