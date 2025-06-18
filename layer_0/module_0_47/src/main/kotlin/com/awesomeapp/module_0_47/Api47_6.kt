package com.awesomeapp.module_0_47

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api47_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api47_6 API"
    }
}