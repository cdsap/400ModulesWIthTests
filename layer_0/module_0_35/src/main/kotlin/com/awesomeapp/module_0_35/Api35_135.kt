package com.awesomeapp.module_0_35

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api35_135 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api35_135 API"
    }
}