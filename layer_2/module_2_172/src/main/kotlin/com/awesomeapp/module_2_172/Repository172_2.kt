package com.awesomeapp.module_2_172

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository172_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository172_2 Repository"
    }
}