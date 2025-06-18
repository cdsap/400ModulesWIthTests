package com.awesomeapp.module_2_215

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository215_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository215_2 Repository"
    }
}