package com.awesomeapp.module_0_21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository21_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository21_2 Repository"
    }
}