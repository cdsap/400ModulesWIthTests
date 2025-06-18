package com.awesomeapp.module_4_350

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api350_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api350_99 API"
    }
}