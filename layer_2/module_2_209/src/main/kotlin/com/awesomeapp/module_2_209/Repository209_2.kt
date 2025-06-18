package com.awesomeapp.module_2_209

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository209_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository209_2 Repository"
    }
}