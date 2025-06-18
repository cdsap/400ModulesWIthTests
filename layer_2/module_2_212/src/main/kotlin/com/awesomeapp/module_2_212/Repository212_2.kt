package com.awesomeapp.module_2_212

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository212_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository212_2 Repository"
    }
}