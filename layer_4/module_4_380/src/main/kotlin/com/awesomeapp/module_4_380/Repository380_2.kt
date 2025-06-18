package com.awesomeapp.module_4_380

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository380_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository380_2 Repository"
    }
}