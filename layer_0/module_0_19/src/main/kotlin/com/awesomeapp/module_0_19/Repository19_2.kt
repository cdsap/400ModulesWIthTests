package com.awesomeapp.module_0_19

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository19_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository19_2 Repository"
    }
}