package com.awesomeapp.module_1_151

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository151_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository151_2 Repository"
    }
}