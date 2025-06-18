package com.awesomeapp.module_3_243

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository243_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository243_2 Repository"
    }
}