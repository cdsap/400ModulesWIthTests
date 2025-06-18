package com.awesomeapp.module_0_75

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository75_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository75_2 Repository"
    }
}