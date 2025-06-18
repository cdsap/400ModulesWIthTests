package com.awesomeapp.module_0_38

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api38_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api38_75 API"
    }
}