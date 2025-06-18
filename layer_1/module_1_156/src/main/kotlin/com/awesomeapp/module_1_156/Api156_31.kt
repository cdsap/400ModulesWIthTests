package com.awesomeapp.module_1_156

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api156_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api156_31 API"
    }
}