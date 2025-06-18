package com.awesomeapp.module_2_203

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api203_168 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api203_168 API"
    }
}