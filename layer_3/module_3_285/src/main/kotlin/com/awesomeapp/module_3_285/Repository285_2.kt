package com.awesomeapp.module_3_285

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository285_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository285_2 Repository"
    }
}