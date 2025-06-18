package com.awesomeapp.module_4_375

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository375_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository375_2 Repository"
    }
}