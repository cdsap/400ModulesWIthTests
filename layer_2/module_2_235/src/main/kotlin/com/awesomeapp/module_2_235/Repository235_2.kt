package com.awesomeapp.module_2_235

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository235_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository235_2 Repository"
    }
}