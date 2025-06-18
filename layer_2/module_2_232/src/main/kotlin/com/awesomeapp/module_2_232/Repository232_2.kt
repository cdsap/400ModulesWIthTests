package com.awesomeapp.module_2_232

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository232_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository232_2 Repository"
    }
}