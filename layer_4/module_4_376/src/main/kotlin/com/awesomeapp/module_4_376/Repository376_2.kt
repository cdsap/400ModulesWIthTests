package com.awesomeapp.module_4_376

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository376_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository376_2 Repository"
    }
}