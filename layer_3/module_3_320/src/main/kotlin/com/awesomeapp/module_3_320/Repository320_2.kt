package com.awesomeapp.module_3_320

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository320_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository320_2 Repository"
    }
}