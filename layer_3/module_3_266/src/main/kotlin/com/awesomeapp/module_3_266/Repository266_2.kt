package com.awesomeapp.module_3_266

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository266_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository266_2 Repository"
    }
}