package com.awesomeapp.module_4_330

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository330_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository330_2 Repository"
    }
}