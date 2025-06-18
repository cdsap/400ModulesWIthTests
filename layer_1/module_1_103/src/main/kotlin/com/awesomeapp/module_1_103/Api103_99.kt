package com.awesomeapp.module_1_103

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api103_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api103_99 API"
    }
}