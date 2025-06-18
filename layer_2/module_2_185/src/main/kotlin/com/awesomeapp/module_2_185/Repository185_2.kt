package com.awesomeapp.module_2_185

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository185_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository185_2 Repository"
    }
}