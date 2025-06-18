package com.awesomeapp.module_1_144

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api144_103 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api144_103 API"
    }
}