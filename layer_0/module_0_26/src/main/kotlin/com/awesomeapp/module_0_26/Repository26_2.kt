package com.awesomeapp.module_0_26

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository26_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository26_2 Repository"
    }
}