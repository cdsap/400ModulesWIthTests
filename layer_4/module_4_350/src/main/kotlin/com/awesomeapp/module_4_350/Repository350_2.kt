package com.awesomeapp.module_4_350

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository350_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository350_2 Repository"
    }
}