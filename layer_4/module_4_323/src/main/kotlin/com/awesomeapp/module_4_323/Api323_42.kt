package com.awesomeapp.module_4_323

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api323_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api323_42 API"
    }
}