package com.awesomeapp.module_4_340

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository340_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository340_2 Repository"
    }
}