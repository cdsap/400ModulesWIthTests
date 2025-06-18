package com.awesomeapp.module_4_360

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository360_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository360_2 Repository"
    }
}