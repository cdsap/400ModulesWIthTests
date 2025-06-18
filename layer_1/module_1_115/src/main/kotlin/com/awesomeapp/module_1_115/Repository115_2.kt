package com.awesomeapp.module_1_115

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository115_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository115_2 Repository"
    }
}