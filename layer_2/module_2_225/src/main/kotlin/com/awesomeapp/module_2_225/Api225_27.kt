package com.awesomeapp.module_2_225

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api225_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api225_27 API"
    }
}