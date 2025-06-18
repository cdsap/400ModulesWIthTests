package com.awesomeapp.module_0_11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository11_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository11_2 Repository"
    }
}