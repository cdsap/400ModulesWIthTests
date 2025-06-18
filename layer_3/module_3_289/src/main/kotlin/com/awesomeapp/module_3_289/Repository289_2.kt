package com.awesomeapp.module_3_289

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository289_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository289_2 Repository"
    }
}