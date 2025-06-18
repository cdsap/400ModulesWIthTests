package com.awesomeapp.module_2_177

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository177_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository177_2 Repository"
    }
}