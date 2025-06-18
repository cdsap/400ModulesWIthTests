package com.awesomeapp.module_2_203

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository203_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository203_2 Repository"
    }
}