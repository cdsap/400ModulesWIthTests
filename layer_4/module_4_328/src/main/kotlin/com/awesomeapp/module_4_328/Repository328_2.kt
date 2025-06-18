package com.awesomeapp.module_4_328

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository328_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository328_2 Repository"
    }
}