package com.awesomeapp.module_1_125

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository125_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository125_2 Repository"
    }
}