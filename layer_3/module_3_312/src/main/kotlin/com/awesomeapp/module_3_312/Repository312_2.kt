package com.awesomeapp.module_3_312

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository312_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository312_2 Repository"
    }
}