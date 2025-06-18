package com.awesomeapp.module_2_220

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api220_34 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api220_34 API"
    }
}