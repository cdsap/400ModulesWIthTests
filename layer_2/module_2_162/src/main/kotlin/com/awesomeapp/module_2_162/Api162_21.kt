package com.awesomeapp.module_2_162

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api162_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api162_21 API"
    }
}