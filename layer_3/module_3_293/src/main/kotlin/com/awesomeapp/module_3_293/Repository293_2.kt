package com.awesomeapp.module_3_293

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository293_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository293_2 Repository"
    }
}