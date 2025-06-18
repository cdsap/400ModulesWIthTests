package com.awesomeapp.module_1_147

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository147_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository147_2 Repository"
    }
}