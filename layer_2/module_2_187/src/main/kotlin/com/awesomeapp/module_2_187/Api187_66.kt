package com.awesomeapp.module_2_187

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api187_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api187_66 API"
    }
}