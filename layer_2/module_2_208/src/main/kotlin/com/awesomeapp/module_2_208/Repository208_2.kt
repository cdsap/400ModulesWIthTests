package com.awesomeapp.module_2_208

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository208_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository208_2 Repository"
    }
}