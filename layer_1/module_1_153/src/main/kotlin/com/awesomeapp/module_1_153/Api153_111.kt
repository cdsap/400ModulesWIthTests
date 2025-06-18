package com.awesomeapp.module_1_153

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api153_111 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api153_111 API"
    }
}