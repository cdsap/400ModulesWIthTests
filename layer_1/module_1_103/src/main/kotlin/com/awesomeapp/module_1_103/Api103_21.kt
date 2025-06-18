package com.awesomeapp.module_1_103

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api103_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api103_21 API"
    }
}