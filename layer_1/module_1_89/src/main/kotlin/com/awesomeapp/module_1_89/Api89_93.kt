package com.awesomeapp.module_1_89

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api89_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api89_93 API"
    }
}