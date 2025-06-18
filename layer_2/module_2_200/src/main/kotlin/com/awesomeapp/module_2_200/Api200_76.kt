package com.awesomeapp.module_2_200

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api200_76 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api200_76 API"
    }
}