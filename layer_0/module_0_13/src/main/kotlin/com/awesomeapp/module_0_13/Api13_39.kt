package com.awesomeapp.module_0_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api13_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api13_39 API"
    }
}