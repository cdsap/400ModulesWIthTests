package com.awesomeapp.module_2_163

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository163_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository163_2 Repository"
    }
}