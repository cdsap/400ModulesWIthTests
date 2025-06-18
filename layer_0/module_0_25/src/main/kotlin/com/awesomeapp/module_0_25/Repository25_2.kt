package com.awesomeapp.module_0_25

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository25_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository25_2 Repository"
    }
}