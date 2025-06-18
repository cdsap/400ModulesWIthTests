package com.awesomeapp.module_0_47

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository47_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository47_2 Repository"
    }
}