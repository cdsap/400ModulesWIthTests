package com.awesomeapp.module_3_296

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api296_139 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api296_139 API"
    }
}