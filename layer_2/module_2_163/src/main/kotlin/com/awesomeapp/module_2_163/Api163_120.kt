package com.awesomeapp.module_2_163

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api163_120 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api163_120 API"
    }
}