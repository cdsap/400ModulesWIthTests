package com.awesomeapp.module_1_99

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository99_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository99_2 Repository"
    }
}