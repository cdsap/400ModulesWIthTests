package com.awesomeapp.module_1_156

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api156_58 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api156_58 API"
    }
}