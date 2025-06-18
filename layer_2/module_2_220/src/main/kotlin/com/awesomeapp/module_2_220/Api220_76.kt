package com.awesomeapp.module_2_220

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api220_76 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api220_76 API"
    }
}