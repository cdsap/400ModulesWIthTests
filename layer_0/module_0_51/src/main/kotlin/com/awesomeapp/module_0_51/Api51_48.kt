package com.awesomeapp.module_0_51

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api51_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api51_48 API"
    }
}