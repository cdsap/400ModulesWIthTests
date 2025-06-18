package com.awesomeapp.module_3_267

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api267_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api267_39 API"
    }
}