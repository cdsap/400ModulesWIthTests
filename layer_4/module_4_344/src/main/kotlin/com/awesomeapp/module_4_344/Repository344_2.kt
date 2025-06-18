package com.awesomeapp.module_4_344

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository344_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository344_2 Repository"
    }
}