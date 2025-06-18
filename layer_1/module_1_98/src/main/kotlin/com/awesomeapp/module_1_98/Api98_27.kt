package com.awesomeapp.module_1_98

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api98_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api98_27 API"
    }
}