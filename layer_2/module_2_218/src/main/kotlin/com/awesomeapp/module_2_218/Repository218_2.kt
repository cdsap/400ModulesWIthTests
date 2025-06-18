package com.awesomeapp.module_2_218

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository218_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository218_2 Repository"
    }
}