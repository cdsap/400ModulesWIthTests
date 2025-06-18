package com.awesomeapp.module_2_191

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api191_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api191_27 API"
    }
}