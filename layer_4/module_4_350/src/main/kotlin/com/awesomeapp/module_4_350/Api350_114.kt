package com.awesomeapp.module_4_350

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api350_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api350_114 API"
    }
}