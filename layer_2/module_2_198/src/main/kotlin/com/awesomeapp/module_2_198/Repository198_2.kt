package com.awesomeapp.module_2_198

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository198_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository198_2 Repository"
    }
}