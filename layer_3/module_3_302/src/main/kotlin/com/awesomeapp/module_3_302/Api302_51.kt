package com.awesomeapp.module_3_302

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api302_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api302_51 API"
    }
}