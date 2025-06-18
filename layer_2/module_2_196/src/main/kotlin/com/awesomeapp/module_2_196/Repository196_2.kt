package com.awesomeapp.module_2_196

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository196_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository196_2 Repository"
    }
}