package com.awesomeapp.module_4_389

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository389_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository389_2 Repository"
    }
}