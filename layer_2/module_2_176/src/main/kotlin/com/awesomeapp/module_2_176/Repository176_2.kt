package com.awesomeapp.module_2_176

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository176_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository176_2 Repository"
    }
}