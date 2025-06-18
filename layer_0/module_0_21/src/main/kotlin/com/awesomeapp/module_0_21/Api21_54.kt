package com.awesomeapp.module_0_21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api21_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api21_54 API"
    }
}