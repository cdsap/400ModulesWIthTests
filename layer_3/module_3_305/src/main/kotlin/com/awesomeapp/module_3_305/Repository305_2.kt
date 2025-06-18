package com.awesomeapp.module_3_305

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository305_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository305_2 Repository"
    }
}