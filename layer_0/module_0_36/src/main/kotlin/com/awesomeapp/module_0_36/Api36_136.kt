package com.awesomeapp.module_0_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api36_136 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api36_136 API"
    }
}