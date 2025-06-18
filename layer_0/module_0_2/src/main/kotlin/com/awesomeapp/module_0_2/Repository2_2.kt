package com.awesomeapp.module_0_2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository2_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository2_2 Repository"
    }
}