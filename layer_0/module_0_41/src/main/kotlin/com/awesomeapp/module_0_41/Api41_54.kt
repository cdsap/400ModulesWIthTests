package com.awesomeapp.module_0_41

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api41_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api41_54 API"
    }
}