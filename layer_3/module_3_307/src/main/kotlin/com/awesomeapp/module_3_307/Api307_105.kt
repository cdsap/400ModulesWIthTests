package com.awesomeapp.module_3_307

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api307_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api307_105 API"
    }
}