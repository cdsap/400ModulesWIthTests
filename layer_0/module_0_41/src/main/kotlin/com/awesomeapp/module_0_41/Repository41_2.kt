package com.awesomeapp.module_0_41

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository41_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository41_2 Repository"
    }
}