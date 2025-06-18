package com.awesomeapp.module_0_10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository10_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository10_2 Repository"
    }
}