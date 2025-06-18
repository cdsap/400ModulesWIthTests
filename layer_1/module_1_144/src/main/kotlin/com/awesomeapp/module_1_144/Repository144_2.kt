package com.awesomeapp.module_1_144

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository144_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository144_2 Repository"
    }
}