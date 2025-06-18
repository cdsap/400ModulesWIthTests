package com.awesomeapp.module_3_296

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api296_19 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api296_19 API"
    }
}