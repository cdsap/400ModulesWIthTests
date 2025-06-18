package com.awesomeapp.module_3_248

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository248_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository248_2 Repository"
    }
}