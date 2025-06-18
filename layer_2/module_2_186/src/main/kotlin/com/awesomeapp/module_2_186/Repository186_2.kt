package com.awesomeapp.module_2_186

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository186_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository186_2 Repository"
    }
}