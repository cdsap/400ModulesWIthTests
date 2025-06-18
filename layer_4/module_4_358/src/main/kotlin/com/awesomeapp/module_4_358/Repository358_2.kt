package com.awesomeapp.module_4_358

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository358_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository358_2 Repository"
    }
}