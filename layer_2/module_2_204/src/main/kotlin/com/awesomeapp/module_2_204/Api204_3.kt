package com.awesomeapp.module_2_204

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api204_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api204_3 API"
    }
}