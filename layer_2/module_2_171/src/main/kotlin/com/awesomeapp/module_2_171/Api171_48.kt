package com.awesomeapp.module_2_171

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api171_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api171_48 API"
    }
}