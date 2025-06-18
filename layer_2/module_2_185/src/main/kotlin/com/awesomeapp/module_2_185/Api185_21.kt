package com.awesomeapp.module_2_185

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api185_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api185_21 API"
    }
}