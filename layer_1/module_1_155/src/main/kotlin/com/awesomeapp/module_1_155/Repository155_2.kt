package com.awesomeapp.module_1_155

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository155_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository155_2 Repository"
    }
}