package com.awesomeapp.module_4_393

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository393_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository393_2 Repository"
    }
}