package com.awesomeapp.module_0_77

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository77_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository77_2 Repository"
    }
}