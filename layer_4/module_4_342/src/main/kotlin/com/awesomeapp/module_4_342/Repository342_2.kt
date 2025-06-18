package com.awesomeapp.module_4_342

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository342_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository342_2 Repository"
    }
}