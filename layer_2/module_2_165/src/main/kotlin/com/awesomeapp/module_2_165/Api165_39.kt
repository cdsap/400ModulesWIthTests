package com.awesomeapp.module_2_165

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api165_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api165_39 API"
    }
}