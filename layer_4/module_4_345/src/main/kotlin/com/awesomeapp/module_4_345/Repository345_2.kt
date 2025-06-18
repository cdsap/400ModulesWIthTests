package com.awesomeapp.module_4_345

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository345_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository345_2 Repository"
    }
}