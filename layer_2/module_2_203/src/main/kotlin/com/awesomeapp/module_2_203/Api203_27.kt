package com.awesomeapp.module_2_203

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api203_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api203_27 API"
    }
}