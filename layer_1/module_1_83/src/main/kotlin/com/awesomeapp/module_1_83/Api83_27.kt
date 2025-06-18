package com.awesomeapp.module_1_83

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api83_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api83_27 API"
    }
}