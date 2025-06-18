package com.awesomeapp.module_4_350

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api350_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api350_51 API"
    }
}