package com.awesomeapp.module_0_26

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api26_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api26_42 API"
    }
}