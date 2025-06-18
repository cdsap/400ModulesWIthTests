package com.awesomeapp.module_4_374

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api374_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api374_84 API"
    }
}