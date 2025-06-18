package com.awesomeapp.module_0_50

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository50_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository50_2 Repository"
    }
}