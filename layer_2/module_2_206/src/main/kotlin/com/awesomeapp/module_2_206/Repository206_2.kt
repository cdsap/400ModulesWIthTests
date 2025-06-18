package com.awesomeapp.module_2_206

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository206_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository206_2 Repository"
    }
}