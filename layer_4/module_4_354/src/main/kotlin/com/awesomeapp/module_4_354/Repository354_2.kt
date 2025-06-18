package com.awesomeapp.module_4_354

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository354_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository354_2 Repository"
    }
}