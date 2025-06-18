package com.awesomeapp.module_3_302

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api302_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api302_66 API"
    }
}