package com.awesomeapp.module_2_182

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api182_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api182_36 API"
    }
}