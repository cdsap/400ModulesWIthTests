package com.awesomeapp.module_3_294

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository294_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository294_2 Repository"
    }
}