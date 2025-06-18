package com.awesomeapp.module_0_73

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository73_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository73_2 Repository"
    }
}