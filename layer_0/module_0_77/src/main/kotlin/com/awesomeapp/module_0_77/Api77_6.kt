package com.awesomeapp.module_0_77

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api77_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api77_6 API"
    }
}