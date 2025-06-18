package com.awesomeapp.module_2_202

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository202_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository202_2 Repository"
    }
}