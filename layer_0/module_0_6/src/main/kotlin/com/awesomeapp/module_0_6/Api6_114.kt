package com.awesomeapp.module_0_6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api6_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api6_114 API"
    }
}