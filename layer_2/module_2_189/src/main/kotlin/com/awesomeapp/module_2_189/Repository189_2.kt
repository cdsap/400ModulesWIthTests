package com.awesomeapp.module_2_189

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository189_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository189_2 Repository"
    }
}