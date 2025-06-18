package com.awesomeapp.module_3_241

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository241_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository241_2 Repository"
    }
}