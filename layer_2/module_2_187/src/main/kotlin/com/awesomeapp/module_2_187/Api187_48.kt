package com.awesomeapp.module_2_187

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api187_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api187_48 API"
    }
}