package com.awesomeapp.module_0_48

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api48_37 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api48_37 API"
    }
}