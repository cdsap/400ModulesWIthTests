package com.awesomeapp.module_4_366

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository366_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository366_2 Repository"
    }
}