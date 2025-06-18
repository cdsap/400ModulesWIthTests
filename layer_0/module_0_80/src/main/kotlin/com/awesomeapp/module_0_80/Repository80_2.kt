package com.awesomeapp.module_0_80

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository80_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository80_2 Repository"
    }
}