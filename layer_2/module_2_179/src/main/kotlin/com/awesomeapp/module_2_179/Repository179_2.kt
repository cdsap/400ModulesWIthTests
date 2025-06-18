package com.awesomeapp.module_2_179

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository179_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository179_2 Repository"
    }
}