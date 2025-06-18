package com.awesomeapp.module_2_194

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api194_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api194_6 API"
    }
}