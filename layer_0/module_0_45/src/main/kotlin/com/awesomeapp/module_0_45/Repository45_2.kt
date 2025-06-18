package com.awesomeapp.module_0_45

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository45_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository45_2 Repository"
    }
}