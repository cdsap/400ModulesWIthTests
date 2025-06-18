package com.awesomeapp.module_1_96

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api96_145 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api96_145 API"
    }
}