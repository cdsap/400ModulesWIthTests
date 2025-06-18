package com.awesomeapp.module_4_398

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository398_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository398_2 Repository"
    }
}