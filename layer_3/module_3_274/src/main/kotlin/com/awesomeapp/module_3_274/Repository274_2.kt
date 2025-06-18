package com.awesomeapp.module_3_274

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository274_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository274_2 Repository"
    }
}