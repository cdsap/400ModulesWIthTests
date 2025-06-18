package com.awesomeapp.module_2_238

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api238_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api238_51 API"
    }
}