package com.awesomeapp.module_0_51

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api51_78 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api51_78 API"
    }
}