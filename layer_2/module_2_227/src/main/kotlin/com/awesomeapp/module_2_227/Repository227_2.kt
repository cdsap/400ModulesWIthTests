package com.awesomeapp.module_2_227

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository227_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository227_2 Repository"
    }
}