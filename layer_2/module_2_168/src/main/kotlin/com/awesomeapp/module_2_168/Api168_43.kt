package com.awesomeapp.module_2_168

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api168_43 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api168_43 API"
    }
}