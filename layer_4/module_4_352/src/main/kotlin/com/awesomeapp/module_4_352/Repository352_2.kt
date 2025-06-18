package com.awesomeapp.module_4_352

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository352_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository352_2 Repository"
    }
}