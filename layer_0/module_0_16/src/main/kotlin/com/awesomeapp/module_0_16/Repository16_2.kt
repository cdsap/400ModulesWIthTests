package com.awesomeapp.module_0_16

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository16_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository16_2 Repository"
    }
}