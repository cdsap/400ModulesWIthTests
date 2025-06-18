package com.awesomeapp.module_1_146

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository146_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository146_2 Repository"
    }
}