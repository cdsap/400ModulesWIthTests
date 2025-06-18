package com.awesomeapp.module_2_228

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api228_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api228_13 API"
    }
}