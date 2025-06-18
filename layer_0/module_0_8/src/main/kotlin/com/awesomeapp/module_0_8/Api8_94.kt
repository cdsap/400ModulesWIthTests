package com.awesomeapp.module_0_8

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api8_94 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api8_94 API"
    }
}