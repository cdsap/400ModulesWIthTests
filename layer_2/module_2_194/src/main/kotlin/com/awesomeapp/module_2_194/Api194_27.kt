package com.awesomeapp.module_2_194

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api194_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api194_27 API"
    }
}