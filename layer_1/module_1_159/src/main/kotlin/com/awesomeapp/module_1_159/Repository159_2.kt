package com.awesomeapp.module_1_159

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository159_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository159_2 Repository"
    }
}