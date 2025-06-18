package com.awesomeapp.module_4_334

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository334_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository334_2 Repository"
    }
}