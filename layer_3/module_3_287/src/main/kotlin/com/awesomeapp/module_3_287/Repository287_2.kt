package com.awesomeapp.module_3_287

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository287_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository287_2 Repository"
    }
}