package com.awesomeapp.module_2_228

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository228_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository228_2 Repository"
    }
}