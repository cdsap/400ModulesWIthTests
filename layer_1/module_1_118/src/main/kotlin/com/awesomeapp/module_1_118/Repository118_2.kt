package com.awesomeapp.module_1_118

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository118_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository118_2 Repository"
    }
}