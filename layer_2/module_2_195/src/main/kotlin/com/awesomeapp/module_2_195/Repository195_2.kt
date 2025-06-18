package com.awesomeapp.module_2_195

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository195_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository195_2 Repository"
    }
}