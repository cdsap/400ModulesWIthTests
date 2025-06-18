package com.awesomeapp.module_1_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository84_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository84_2 Repository"
    }
}