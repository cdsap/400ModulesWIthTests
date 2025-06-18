package com.awesomeapp.module_2_167

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository167_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository167_2 Repository"
    }
}