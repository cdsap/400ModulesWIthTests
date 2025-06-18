package com.awesomeapp.module_0_22

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository22_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository22_2 Repository"
    }
}