package com.awesomeapp.module_2_192

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository192_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository192_2 Repository"
    }
}