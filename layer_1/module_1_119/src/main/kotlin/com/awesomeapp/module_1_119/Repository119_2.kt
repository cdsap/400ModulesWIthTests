package com.awesomeapp.module_1_119

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository119_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository119_2 Repository"
    }
}