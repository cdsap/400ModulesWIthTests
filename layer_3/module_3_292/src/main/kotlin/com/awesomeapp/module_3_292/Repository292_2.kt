package com.awesomeapp.module_3_292

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository292_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository292_2 Repository"
    }
}