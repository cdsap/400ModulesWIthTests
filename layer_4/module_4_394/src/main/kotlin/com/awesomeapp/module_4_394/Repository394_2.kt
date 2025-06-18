package com.awesomeapp.module_4_394

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository394_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository394_2 Repository"
    }
}