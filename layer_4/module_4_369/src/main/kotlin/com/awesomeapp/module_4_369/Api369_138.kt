package com.awesomeapp.module_4_369

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api369_138 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api369_138 API"
    }
}