package com.awesomeapp.module_3_279

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository279_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository279_2 Repository"
    }
}