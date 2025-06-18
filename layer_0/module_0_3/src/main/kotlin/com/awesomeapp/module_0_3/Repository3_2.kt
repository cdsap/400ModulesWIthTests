package com.awesomeapp.module_0_3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository3_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository3_2 Repository"
    }
}