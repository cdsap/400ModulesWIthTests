package com.awesomeapp.module_1_136

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository136_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository136_2 Repository"
    }
}