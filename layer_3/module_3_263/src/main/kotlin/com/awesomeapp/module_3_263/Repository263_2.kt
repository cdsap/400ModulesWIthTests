package com.awesomeapp.module_3_263

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository263_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository263_2 Repository"
    }
}