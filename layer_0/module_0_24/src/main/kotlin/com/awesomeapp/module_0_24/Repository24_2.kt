package com.awesomeapp.module_0_24

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository24_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository24_2 Repository"
    }
}