package com.awesomeapp.module_0_65

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api65_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api65_60 API"
    }
}