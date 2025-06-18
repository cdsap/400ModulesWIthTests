package com.awesomeapp.module_0_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api13_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api13_42 API"
    }
}