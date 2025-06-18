package com.awesomeapp.module_0_71

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository71_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository71_2 Repository"
    }
}