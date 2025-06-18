package com.awesomeapp.module_3_281

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository281_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository281_2 Repository"
    }
}