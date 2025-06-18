package com.awesomeapp.module_2_165

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api165_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api165_96 API"
    }
}