package com.awesomeapp.module_1_151

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api151_150 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api151_150 API"
    }
}