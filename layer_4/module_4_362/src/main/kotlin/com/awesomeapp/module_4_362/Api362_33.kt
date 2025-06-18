package com.awesomeapp.module_4_362

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api362_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api362_33 API"
    }
}