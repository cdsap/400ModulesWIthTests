package com.awesomeapp.module_1_120

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository120_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository120_2 Repository"
    }
}