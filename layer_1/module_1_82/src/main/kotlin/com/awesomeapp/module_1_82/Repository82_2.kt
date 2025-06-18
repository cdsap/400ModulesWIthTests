package com.awesomeapp.module_1_82

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository82_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository82_2 Repository"
    }
}