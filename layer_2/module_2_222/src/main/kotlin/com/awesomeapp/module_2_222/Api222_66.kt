package com.awesomeapp.module_2_222

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api222_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api222_66 API"
    }
}