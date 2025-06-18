package com.awesomeapp.module_1_86

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository86_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository86_2 Repository"
    }
}