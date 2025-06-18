package com.awesomeapp.module_3_309

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository309_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository309_2 Repository"
    }
}