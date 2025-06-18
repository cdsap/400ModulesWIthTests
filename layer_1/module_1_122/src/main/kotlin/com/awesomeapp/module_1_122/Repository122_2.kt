package com.awesomeapp.module_1_122

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository122_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository122_2 Repository"
    }
}