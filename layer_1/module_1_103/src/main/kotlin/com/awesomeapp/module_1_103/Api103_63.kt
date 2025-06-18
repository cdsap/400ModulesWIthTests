package com.awesomeapp.module_1_103

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api103_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api103_63 API"
    }
}