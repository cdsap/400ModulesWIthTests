package com.awesomeapp.module_0_72

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository72_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository72_2 Repository"
    }
}