package com.awesomeapp.module_2_183

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api183_156 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api183_156 API"
    }
}