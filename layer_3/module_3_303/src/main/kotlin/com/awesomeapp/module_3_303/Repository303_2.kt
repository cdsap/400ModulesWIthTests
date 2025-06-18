package com.awesomeapp.module_3_303

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository303_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository303_2 Repository"
    }
}