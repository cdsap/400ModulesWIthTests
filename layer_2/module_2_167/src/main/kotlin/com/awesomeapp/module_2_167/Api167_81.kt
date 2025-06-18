package com.awesomeapp.module_2_167

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api167_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api167_81 API"
    }
}