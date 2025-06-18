package com.awesomeapp.module_4_381

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api381_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api381_63 API"
    }
}