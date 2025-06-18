package com.awesomeapp.module_4_373

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository373_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository373_2 Repository"
    }
}