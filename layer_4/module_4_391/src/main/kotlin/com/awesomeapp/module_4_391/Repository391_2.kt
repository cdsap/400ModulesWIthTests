package com.awesomeapp.module_4_391

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository391_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository391_2 Repository"
    }
}