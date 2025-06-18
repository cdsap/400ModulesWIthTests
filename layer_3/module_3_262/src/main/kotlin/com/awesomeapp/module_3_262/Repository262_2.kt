package com.awesomeapp.module_3_262

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository262_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository262_2 Repository"
    }
}