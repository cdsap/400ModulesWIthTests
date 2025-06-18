package com.awesomeapp.module_1_115

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api115_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api115_6 API"
    }
}