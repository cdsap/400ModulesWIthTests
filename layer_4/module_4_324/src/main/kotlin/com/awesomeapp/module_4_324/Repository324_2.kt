package com.awesomeapp.module_4_324

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository324_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository324_2 Repository"
    }
}