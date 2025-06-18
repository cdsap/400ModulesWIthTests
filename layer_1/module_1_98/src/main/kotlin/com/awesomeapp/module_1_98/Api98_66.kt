package com.awesomeapp.module_1_98

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api98_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api98_66 API"
    }
}