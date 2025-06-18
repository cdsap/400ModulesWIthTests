package com.awesomeapp.module_2_161

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository161_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository161_2 Repository"
    }
}