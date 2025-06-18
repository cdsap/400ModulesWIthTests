package com.awesomeapp.module_3_299

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository299_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository299_2 Repository"
    }
}