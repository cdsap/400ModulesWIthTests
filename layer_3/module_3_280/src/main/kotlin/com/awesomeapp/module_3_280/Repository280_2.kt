package com.awesomeapp.module_3_280

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository280_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository280_2 Repository"
    }
}