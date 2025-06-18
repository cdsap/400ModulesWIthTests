package com.awesomeapp.module_0_49

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository49_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository49_2 Repository"
    }
}