package com.awesomeapp.module_0_21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api21_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api21_21 API"
    }
}