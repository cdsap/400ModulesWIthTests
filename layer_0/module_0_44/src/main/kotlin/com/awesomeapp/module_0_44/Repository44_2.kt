package com.awesomeapp.module_0_44

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository44_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository44_2 Repository"
    }
}