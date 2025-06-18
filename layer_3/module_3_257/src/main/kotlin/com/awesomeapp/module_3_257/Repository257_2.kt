package com.awesomeapp.module_3_257

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository257_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository257_2 Repository"
    }
}