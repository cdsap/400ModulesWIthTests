package com.awesomeapp.module_2_178

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository178_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository178_2 Repository"
    }
}