package com.awesomeapp.module_3_259

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository259_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository259_2 Repository"
    }
}