package com.awesomeapp.module_2_217

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository217_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository217_2 Repository"
    }
}