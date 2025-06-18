package com.awesomeapp.module_5_401

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository401_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository401_2 Repository"
    }
}